package Archivos_o_File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerPrintWriteCombinados {
    

    public static void main(String[] args) {
        
        try {
            String nombreFichero = "ejemplo.txt";

            PrintWriter pw = new PrintWriter(nombreFichero);

            for (int i = 1; i <= 1000; i++) {
                pw.print(i + " ");
                if (i % 100 == 0) pw.println();
                }
                pw.close();

                Scanner scc = new Scanner(new FileReader(nombreFichero));
                while (scc.hasNext()) {//leer mientras exista valores que leer.
                   if (scc.hasNextInt())  System.out.println("Valor leido: " + scc.nextInt());// si es un entero imprime valor leido
                   else scc.next();// si no es un entero y es una string ignora y pasa al siguiente valor o token.
                }
                    scc.close();
                
        } catch (IOException e) {
            System.out.println("Problemas en el fichero.");
        }
    }
}
