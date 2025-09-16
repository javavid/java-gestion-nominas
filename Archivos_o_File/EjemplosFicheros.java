package Archivos_o_File;

import java.io.File;

public class EjemplosFicheros {

    public static void main(String[] args) {
        File fichero = new File("ejemplo.txt");
        if (fichero.exists()) System.out.println("el fichero existe");
        else 
        System.out.println("el fichero no exixte");
        System.out.println("Nombre: " + fichero.getName());
        System.out.println("Longitud: " + fichero.length());
        System.out.println("Ruta Absoluta: " + fichero.getAbsolutePath());
        System.out.println(" ");
        System.out.println(" ");

        File fichero2 = new File("archivo.txt");
        if (fichero2.exists()) System.out.println("el fichero existe");
        else 
        System.out.println("el fichero no exixte");
        System.out.println("Nombre: " + fichero2.getName());
        System.out.println("Longitud: " + fichero2.length());
        System.out.println("Ruta Absoluta: " + fichero2.getAbsolutePath());
        System.out.println(" ");
        System.out.println(" ");

        //File carpeta = new File("C:/Users");// este es otra instancia donde la longitud de la carpeta si aparece.
        File carpeta = new File("C:/VerseBien");
        if (carpeta.exists()) System.out.println("la carpeta existe");
        else 
        System.out.println("la carpeta no exixte");
        System.out.println("Nombre: " + carpeta.getName());
        System.out.println("Longitud: " + carpeta.length());
        System.out.println("Ruta Absoluta: " + carpeta.getAbsolutePath());
    }
}
