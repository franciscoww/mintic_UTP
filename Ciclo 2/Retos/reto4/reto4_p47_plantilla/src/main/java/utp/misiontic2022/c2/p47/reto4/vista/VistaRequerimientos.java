package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {
        try {
            // Su código
            ArrayList<Requerimiento_1> requerimientoN1 = controlador.consultarRequerimiento1();
            for (Requerimiento_1 requerimiento_1 : requerimientoN1) {
                System.out.printf("%s %s %d\n", requerimiento_1.getLider(), requerimiento_1.getCargo(),
                        requerimiento_1.getProyectos());

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2() {
        try {
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3() {
        try {
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
