package metodo.lagrange;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ulisesarce
 */
public class Tabla2 extends AbstractTableModel {

    public String[] columnas = {"i", "x", "y"};
    public ArrayList<Punto1> datos = new ArrayList<Punto1>();
    ArrayList<Punto1> dat;
    //Constructor

    Tabla2() {

    }

    @Override
    public int getRowCount() {

        return this.datos.size();
    }

    @Override
    public int getColumnCount() {

        return this.columnas.length;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return super.isCellEditable(rowIndex, columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return this.columnas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Punto1 p = this.datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getI();
            case 1:
                return p.getX();
            case 2:
                return p.getY();
        }
        return null;
    }

    public void addPunto(Punto1 p) {
        p.setI(this.datos.size());
        this.datos.add(p);
        this.fireTableRowsInserted(this.datos.size() - 1, this.datos.size() - 1);
    }

}
