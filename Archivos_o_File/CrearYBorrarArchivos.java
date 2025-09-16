package Archivos_o_File;

import java.io.File;
import java.io.IOException;



public class CrearYBorrarArchivos {
    
    public static void main(String[] args) {

        File archivo = new File("nuevoArchivo.txt");
        try {
            if (archivo.createNewFile()) System.out.println("Archivo Creado con exito");
            else
            System.out.println("El Archivo ya Existe");

        } catch (IOException e)
        {
            e.printStackTrace();;
        }

        System.out.println("\n");

        File directorio = new File("nuevoDirectorio");
        if (directorio.mkdir()) System.out.println("Directorio Creado con exito");
        else
        System.out.println("No se puedo crear el directorio");

        System.out.println("\n");

        File archivoBorrar = new File("archivoParaEliminar.txt");
        if (archivoBorrar.delete()) System.out.println("Archivo borrado con exito");
        else
        System.out.println("No se pudo eliminar el archivo");

        System.out.println("\n");

        File directorio2 = new File(".");
        String [] archi = directorio2.list();
        if (archi != null)
        {
         for (String arc : archi) System.out.println(arc);
        }
        else System.out.println("No hay archivos en la carpeta.");
    }
}
