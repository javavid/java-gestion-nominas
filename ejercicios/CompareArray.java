package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class CompareArray {
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);

        Random r = new Random();

        int[] vector = new int[20];
        
        System.out.println("enteros aleatorios");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = r.nextInt(50);
            System.out.println("numero aleatorio [" + vector[i] + "]");
        }
        
        System.out.println("Introdusca el entero a comparar");
        int entero = n.nextInt();

        compare(vector, entero);

        n.close();
    }

    static void compare(int[]array, int ent)
    {
       int contador = 0;

        for (int i = 0; i < array.length; i++) {
            
            if (ent == array[i] )
            {
                contador++;
            }
            
        }
        
        System.out.println("El " + ent + " esta " + contador + " veces");
    }
}
