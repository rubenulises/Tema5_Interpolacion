package metodo.lagrange;

import java.util.ArrayList;

/**
 *
 * @author ulisesarce
 */
public class Principal2 {

    private ArrayList<Punto2> dato;

    Principal2 (ArrayList<Punto2> list) 
    {
        this.dato = list;
    }

    public String getLagrange3() {
        int a, b, c;
        String cad = "";
        String polinomio3 = "";
        for (a = 0; a < this.dato.size(); a++) {
            for (b = 0; b < this.dato.size(); b++) {

                for (c = 0; c < this.dato.size(); c++) {
                    if (c != b & c != a) {

                        cad = "(x- " + String.valueOf(this.dato.get(c).getX2()) + ")" + 
                              "(x- " + String.valueOf(this.dato.get(b).getX2()) + " ) / ";
                        cad += "(" + String.valueOf(this.dato.get(a).getX2()) + " - " + 
                               String.valueOf(this.dato.get(c).getX2()) + ")" + "(" + 
                               String.valueOf(this.dato.get(a).getX2()) + " - " + String.valueOf(this.dato.get(b).getX2()) 
                                + ") ";
                    }

                }

            }
            polinomio3 += cad + "*" + String.valueOf(this.dato.get(a).getY2()) + " \n";

        }
        return polinomio3;
    }
}
