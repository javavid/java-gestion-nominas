package ejercicios;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);

        System.out.println("Introduzca la palabra:");
        String palabra = n.nextLine();

        String invertida = new StringBuilder(palabra).reverse().toString();

        if (palabra.equalsIgnoreCase(invertida)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }

        n.close();
    }
}



    

