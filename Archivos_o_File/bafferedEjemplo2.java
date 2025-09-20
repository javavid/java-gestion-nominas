package Archivos_o_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class bafferedEjemplo2 {
    

    public static void main(String[] args) {
        
        String fichero = "filewrite.txt";
        contarPlabras(fichero);


    }

    public static void contarPlabras(String fichero)
    {
        try {
            int palabras = 0;
            BufferedReader contar = new BufferedReader(new FileReader(fichero));
            String linea;
            while ((linea = contar.readLine()) != null) {// readLinea() lee el archivo y lo guarda en linea, mientras linea se != null entra la bucle

                //opcion 1 con programacion funcional.
                palabras += Arrays.stream(linea.split("\\s+")).count();

                //opcion 2 convencional mas lineas.
                //String[] palabrasLinea = linea.split("\\s+");//split separa en arrary cada palabra utilizando un espacio en blanco y lo acomula en el array palabrasLinea.
                //palabras += palabrasLinea.length;//suma las palabras que hay en linea.
            }
            contar.close();
            System.out.println(fichero + " contiene " + palabras + " palabras.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
