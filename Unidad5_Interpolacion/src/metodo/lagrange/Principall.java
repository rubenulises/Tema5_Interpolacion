
package metodo.lagrange;

import java.util.ArrayList;

/**
 *
 * @author ulisesarce
 */
public class Principall {

    private ArrayList<Punto1> dat;

    Principall(ArrayList<Punto1> lista) {
        this.dat = lista;
    }

    public String getLagrange2() {
        int i, j;
        String lag = "";
        String polinomio = "";
        for (i = 0; i < this.dat.size(); i++) {
            lag = "";
            for (j = 0; j < this.dat.size(); j++) {
                if (j != i) {

                    lag = "(x- " + String.valueOf(this.dat.get(j).getX()) + " ) / ";
                    lag += "(" + String.valueOf(this.dat.get(i).getX()) + " - " + String.valueOf(this.dat.get(j).getX()) + ")";

                }

            }

            polinomio += lag + "*" + String.valueOf(this.dat.get(i).getY()) + "\n";

        }
        return polinomio;

    }

}
