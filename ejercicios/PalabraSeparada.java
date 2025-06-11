package ejercicios;
import java.util.Scanner;

public class PalabraSeparada {
    public static void main(String[] args) {
        
       Scanner palabra = new Scanner(System.in);
        
        String partes;
        System.out.println("introduce una palabra");
         partes = palabra.nextLine();

        String[] resultado = partes.split("");

        
        for (String result : resultado) {
            System.out.print(" " + result);
        }
            
        
        palabra.close();
    }
}
