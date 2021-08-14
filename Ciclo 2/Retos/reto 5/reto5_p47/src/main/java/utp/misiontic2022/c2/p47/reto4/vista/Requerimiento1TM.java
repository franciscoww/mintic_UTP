package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;

public class Requerimiento1TM extends AbstractTableModel {

    private List<Requerimiento_1> requer1;

    public Requerimiento1TM() {
        this(new ArrayList<>());
    }

    public Requerimiento1TM(List<Requerimiento_1> requer1) {
        this.requer1 = requer1;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Lider";
            case 1:
                return "Cargo";
            case 2:
                return "# Proyectos";
        }
        return super.getColumnName(column);
    }

    @Override
    public int getRowCount() {
        return requer1.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_1 req = requer1.get(row);
        switch (column) {
            case 0:
                return req.getLider();
            case 1:
                return req.getCargo();
            case 2:
                return req.getProyectos();
        }
        return null;
    }

}
