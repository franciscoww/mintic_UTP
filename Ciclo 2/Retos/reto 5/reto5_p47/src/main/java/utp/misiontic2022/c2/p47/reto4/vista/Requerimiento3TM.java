package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class Requerimiento3TM extends AbstractTableModel {

    private List<Requerimiento_3> requer3;
    
    public Requerimiento3TM() {
        this(new ArrayList<>());
    }

    public Requerimiento3TM(List<Requerimiento_3> requer3) {
        this.requer3 = requer3;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID_Proyecto";
            case 1:
                return "Ciudad";
            case 2:
                return "Clasificacion";
            case 3:
                return "Costo_Proyecto";
        }
        return super.getColumnName(column); 
    }
      
    @Override
    public int getRowCount() {
        return requer3.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_3 req3 = requer3.get(row);
        switch(column){
            case 0:
                return req3.getId_Proyecto();
            case 1:
                return  req3.getCiudad();
            case 2:
                return req3.getClasificacion();
            case 3:
                return req3.getCosto_Proyecto();
        }
        return null;
    }
    
}
