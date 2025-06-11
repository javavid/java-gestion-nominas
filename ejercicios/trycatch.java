package ejercicios;

import java.io.FileReader;


public class trycatch {

    
    public static void main(String[] args) {
        
        try (FileReader archivo = new FileReader("archivo.txt")) {
        } catch (Exception e) {
            System.out.println("El archivo no se encontro");
        }
    }
}
