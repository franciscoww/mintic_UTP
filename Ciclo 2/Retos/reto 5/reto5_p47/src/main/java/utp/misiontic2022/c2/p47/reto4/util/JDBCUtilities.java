/**
 * No se debe modificar
 */
package utp.misiontic2022.c2.p47.reto4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    private static final String DATABASE_LOCATION = "/home/francisco/Documentos/Programacion UTP/Ciclo 2/Retos/reto4/reto4_p47_plantilla/ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}
