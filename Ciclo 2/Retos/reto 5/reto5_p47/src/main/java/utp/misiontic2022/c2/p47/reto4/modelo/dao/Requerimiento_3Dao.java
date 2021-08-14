package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento_3> requer3 = new ArrayList<>();
        Requerimiento_3 registro3 = null;

        String sql = "SELECT DISTINCT P.ID_Proyecto,P.Ciudad,P.Clasificacion, "
                        +"SUM(C.Cantidad * MC.Precio_Unidad) AS 'Costo_Proyecto' "
                    +"FROM Proyecto AS P "
                    +"INNER JOIN MaterialConstruccion AS MC ON "
                        +"MC.ID_MaterialConstruccion = C.ID_MaterialConstruccion "
                    +"INNER JOIN Compra AS C ON C.ID_Proyecto = P.ID_Proyecto "
                    +"WHERE P.Ciudad IN ('Monteria', 'Santa Marta') "
                    +"GROUP BY P.ID_Proyecto "
                    +"HAVING SUM(C.Cantidad * MC.Precio_Unidad) > 70000 "
                    +"ORDER BY P.Ciudad ,P.Clasificacion,P.ID_Proyecto;";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while (rs.next()) {
                registro3 = new Requerimiento_3();

                registro3.setId_Proyecto(rs.getInt("ID_Proyecto"));
                registro3.setCiudad(rs.getString("Ciudad"));
                registro3.setClasificacion(rs.getString("Clasificacion"));
                registro3.setCosto_Proyecto(rs.getInt("Costo_Proyecto"));

                requer3.add(registro3);
            }
        }
        return requer3;
    }
}