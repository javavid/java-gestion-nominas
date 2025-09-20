package Archivos_o_File;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class PrintWriteEjemplo {
    
    public static void main(String[] args) {
        

        String fichero = "archivo.txt";

        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fichero, true));//hacemos un true append para que no machaque la informacion del fichero y lo cambien si no que este escriba debajo.
            pw.print("esto es un texto sin salto de linea. ");
            pw.println("NUEVA PALABRA.");
            pw.println("esto es un texto con salto de linea.");
            pw.println(4.5455);

            Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9,10})// creamos un arrays.
            .filter(n -> n > 2)// filtramos solo lo que son mayores a 2.
            .map(n -> n*2)// los numeros que pasaron el filtro, es decir mayores a 2 se multiplican por 2.
            .forEach(n -> pw.println(n));//recorremos.

            pw.close();//cerramos.
        } catch (FileNotFoundException e) {
            System.out.println("fichero no encontrado.");
        }
        catch (IOException e){
            System.out.println("problemas al escribir en el fichero.");
        }
    }
}
