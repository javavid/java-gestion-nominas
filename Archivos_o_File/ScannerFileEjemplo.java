package Archivos_o_File;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileEjemplo {
    

    public static void main(String[] args) {
        
        File archivo = new File("archivo.txt");

        try {
            Scanner scc = new Scanner(archivo);

            while (scc.hasNextLine()) {
                String linea = scc.nextLine();
                System.out.println(linea);
            }
            scc.close();
        } catch (FileNotFoundException e) {
            System.out.println("no se pudo encontrar el archivo.");
        }
    }
}
