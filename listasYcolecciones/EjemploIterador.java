package listasYcolecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterador {
    

    public static void main(String[] args) {
        

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Fabio Leon");
        nombres.add("Martha Idalia");
        nombres.add("Eder David");
        nombres.add("Sara Melissa");

        Iterator<String> name =  nombres.iterator(); 
        while (name.hasNext())
        {
            String clientes = name.next();
            if (clientes.equals("Eder David")) {
                name.remove();
                System.out.println(clientes);
            }    
        }
            System.out.println(nombres);
    }
}
