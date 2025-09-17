package Archivos_o_File;

import java.io.FileReader;
import java.io.IOException;

public class EscribirFichero2 {
    

    public static void main(String[] args) {
        

        String fichero = "filewrite.txt";

        try {
            FileReader fileReader = new FileReader(fichero);//creamos un objeto FileReader.

            //leer y mostrar el contenido del archivo.
            int caracter;
            System.out.println("contenido del archivo " + fichero + ":");
            while ((caracter = fileReader.read()) != -1)//el metodo reaad() recorre y devuelve un entero asignando un codigo unicode caracter hasta llegar a -1  el cual termina el bucle.
            {
                System.out.print((char) caracter);//se realiza casting de caracter a char y si solo ponemos caracter y quitamos char sale cada letra representada por un numero unicode, se puede ver entrando en la tabla ACCII en su pagina web.
            }
            fileReader.close();//cerramos fileReader
        } catch (IOException e) {
            System.out.println("Ocurrio un error al leer el archivo");
            e.printStackTrace();
        }
    }
}
