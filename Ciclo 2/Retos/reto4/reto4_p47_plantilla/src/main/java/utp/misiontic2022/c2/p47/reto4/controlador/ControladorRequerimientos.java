package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_1Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {
    // Su código
    private Requerimiento_1Dao requeri1;

    public ControladorRequerimientos() {
        this.requeri1 = new Requerimiento_1Dao();
    }

    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        // Su código
        return requeri1.requerimiento1();
    }

    // public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
    //     // Su código
    // }

    // public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
    //     // Su código
    // }
}
