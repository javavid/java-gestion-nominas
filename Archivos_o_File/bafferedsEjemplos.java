package Archivos_o_File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bafferedsEjemplos {
    

    public static void main(String[] args) {
        String archivo = "nuevoArchivo.txt";
        int n = 10;
        archivoEntero(archivo, n);
    }

    public static void archivoEntero(String cadena, int n)
    {
        try {
            BufferedWriter bufferedescritura1 = new BufferedWriter(new FileWriter(cadena));
            for (int i = 1; i <= n; i++) {
                bufferedescritura1.write("Esta es la linea: " + i);
                bufferedescritura1.newLine();
            }
            bufferedescritura1.close();
            System.out.println(cadena + " creado con " + n + " lineas.");
        } catch (IOException e) {
            System.out.println("error al crear o escribir el archivo :" + e.getMessage());
        }
    }
}
