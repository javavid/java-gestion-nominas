package ejercicios;
/*
 * 
 * 
 */

import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        int Num = 1;
        int suma = 0;

        while (Num != 0) {
            
            System.out.println("introduzca un numero");
             Num = n.nextInt();

            suma+=Num;

        }
        n.close();
        System.out.println("La suma total es: " + suma);
    }
}
