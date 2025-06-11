package ejercicios;
/*crea un programa en JAVA que reciba 5 palabras y luego nos muestre la que tiene una mayor longitud.*/

import java.util.Scanner;

public class longitudCadena{

    public static void main(String[] args) {
     
        Scanner L = new Scanner(System.in);
        int cp = 0;
        String palabra;
        String palabraLarga = "";
        while (cp < 5)
        {
            System.out.println("introduzca la palabra");
             palabra = L.nextLine();

             if (palabra.length() > palabraLarga.length() ) {
                palabraLarga = palabra;
             }
             cp++;
        }
        System.out.println("la palabra con mayor longitud es: " + palabraLarga);
            L.close();
    }
    
}
