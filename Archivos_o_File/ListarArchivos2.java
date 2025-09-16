package Archivos_o_File;

import java.io.File;

public class ListarArchivos2 {
    

    public static void main(String[] args) {
        
        String ruta = ".";
        listarArchivosMetodo(new File(ruta));

    }

    public static void listarArchivosMetodo(File archi) {
        if (archi.isDirectory()) {
            File[] lisArchivo = archi.listFiles();
            for (File file : lisArchivo) {
                if (file.isFile()) System.out.println(file.getPath());// getPath muestra todo desde el directorio actual.
                else if (file.isDirectory()) {
                    System.out.println(file.getPath());
                    listarArchivosMetodo(file);// recursividad llamando al mismo metodo mas rendimiento.
                }
            }
        }
    }

}
