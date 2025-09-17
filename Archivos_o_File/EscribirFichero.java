package Archivos_o_File;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {
    

    public static void main(String[] args) {
        
        String texto = "este pedasito de texto se hace con el fin de dar un ejemplo de como se atravez de filewrite se escribe este string";
        String fichero = "filewrite.txt";

        try {
            FileWriter fileWriter = new FileWriter(fichero);//creamos un objeto.
            fileWriter.write(texto);//escribimos una string en el archivo.
            fileWriter.close();//cerramos el filewrite.
            System.out.println("se ha escrito el fichero completamente.");            
        } catch (IOException e) {
            System.out.println("Ocurrio un error al escribir el fichero.");
            e.printStackTrace();
        }
    }
}
