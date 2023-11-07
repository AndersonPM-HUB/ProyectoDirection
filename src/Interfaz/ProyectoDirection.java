
package Interfaz;

import gfutria.SearchStateSpaces;
import java.util.ArrayList;
import modelo.DirectionChange;


public class ProyectoDirection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        DirectionChange dcv = new DirectionChange(0,23);
        SearchStateSpaces sss = new SearchStateSpaces("(19,1)", dcv, 4);
        ArrayList <String> lst = sss.solve();
        
       
        String[][] x = dcv.getWorld();
        

        
        System.out.println("Número de pasos: " + lst.size());
        if (lst.size() > 0)
        { for (int i=0; i<lst.size(); i++)
               System.out.println(lst.get(i)); 
        }
        
//        System.out.print("   ");
//        for (int j = 0; j < x[0].length; j++) {
//            System.out.printf("%5d", j);
//        }
//        System.out.println(); // Salto de línea después de los encabezados de las columnas
//
//        // Contenido de la matriz con encabezados de filas (números)
//        for (int i = 0; i < x.length; i++) {
//            System.out.printf("%2d ", i); // Encabezado de la fila (número)
//            for (int j = 0; j < x[i].length; j++) {
//                System.out.print(x[i][j] + " ");
//            }
//            System.out.println(); // Salto de línea al final de cada fila
//        }
        
        
    }

}
