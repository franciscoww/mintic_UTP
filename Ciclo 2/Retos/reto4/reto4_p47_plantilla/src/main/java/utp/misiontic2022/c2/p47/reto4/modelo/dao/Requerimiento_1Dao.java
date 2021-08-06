package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> requer1 = new ArrayList<>();
        Requerimiento_1 registro1 = null;

        String sql = "SELECT Nombre || ' ' || Primer_Apellido as Lider,Cargo,"
                        +"COUNT(p.ID_Lider) as ',Proyectos' "
                    +"FROM Lider l,Proyecto p "
                    +"WHERE p.Constructora = 'Arquitectura S.A.' and p.ID_Lider = l.ID_Lider "
                    +"GROUP BY l.ID_Lider "
                    +"ORDER BY Cargo,Lider ;";
        
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                registro1 = new Requerimiento_1();

                registro1.setLider(rs.getString("Lider"));
                registro1.setCargo(rs.getString("Cargo"));
                registro1.setProyectos(rs.getInt("Proyectos"));

                requer1.add(registro1);
            }
        } 

        return requer1;
    }

}