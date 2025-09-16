package Archivos_o_File;

import java.io.File;

public class ListarArchivos {
    
    public static void main(String[] args) {
        
        String ruta = ".";// ruta de la carpeta actual
        listarArchivos(ruta);

    }

    public static void listarArchivos(String listarArchivos)// metodo listar carpeta
    {
        File archivosFile = new File(listarArchivos);// instancia de la clase File y se le pasa el parametro del metodo.

        if (archivosFile.isDirectory())// si ese fichero es una carpeta entonces lista los archivo dentro de el.
        {
        File[] lisArc = archivosFile.listFiles();  // Array de archivos. 
        for (File lA : lisArc) {//recorremos ese array de instancias de la clase File
            if (lA.isFile()) {// si es un archivo entonce imprimir nombre del archivo y longitud de bytes.
                System.out.println("Nombre: " + lA.getName() + " Longitud: " + lA.length() + " bytes");
            }
            else
            System.out.println("esto es una carpeta y no un archivo.");// si no es un archivo y en cambio es una carpeta.
        }
        }
    }
}
