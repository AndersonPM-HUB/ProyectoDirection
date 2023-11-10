package Interfaz;

import gfutria.SearchStateSpaces;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modelo.DirectionChange;

public class ProyectoDirection {

   
    public static void main(String[] args) {

        DirectionChange dcv = new DirectionChange(0, 23);
        SearchStateSpaces sss = new SearchStateSpaces("(19,1)", dcv, 4);
        ArrayList<String> lst = sss.solve();

        System.out.println("Número de pasos: " + lst.size());
        if (lst.size() > 0) {
            for (int i = 0; i < lst.size(); i++) {
                System.out.println(lst.get(i));
            }
        }  
    }

}
