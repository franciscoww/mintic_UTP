package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código
        ArrayList<Requerimiento_2> requer2 = new ArrayList<>();
        Requerimiento_2 registro2 = null;

        String sql = "SELECT M.ID_MaterialConstruccion,M.Nombre_Material,C.Cantidad, "
                        +"M.Precio_Unidad,( C.Cantidad * M.Precio_Unidad ) AS Precio_Total "
                    +"FROM Compra AS C "
                    +"INNER JOIN MaterialConstruccion AS M ON M.ID_MaterialConstruccion = C.ID_MaterialConstruccion "
                    +"INNER JOIN Proyecto AS P ON P.ID_Proyecto = C.ID_Proyecto "
                    +"WHERE P.ID_Proyecto IN (10, 14, 23, 24, 38, 50, 29) "
                    +"ORDER BY P.ID_Proyecto ASC,M.Precio_Unidad DESC;";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                registro2 = new Requerimiento_2();

                registro2.setId_MaterialConstruccion(rs.getInt("ID_MaterialConstruccion"));
                registro2.setNombre_Material(rs.getString("Nombre_Material"));
                registro2.setCantidad(rs.getInt("Cantidad"));
                registro2.setPrecio_Unidad(rs.getInt("Precio_Unidad"));
                registro2.setPrecio_Total(rs.getInt("Precio_Total"));

                requer2.add(registro2);
            }
            
        } 
        return requer2;
    }
}