package ejercicios;

/*
 * crea un metodo que obtenga el resultado de elevar un numero a otro.
 * Ambos numeros se debe pasar por parametros. los numeros deneb ser postivos.
 */

import java.util.Scanner;

public class NumElevado {
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        System.out.println("ingrese el numero base");
        int base = n.nextInt();
        System.out.println("ingrese numero exponente");
        int exponente = n.nextInt();
        potencia(base, exponente);
        System.out.println("El resultado de elevar " + base + "^(" + exponente + ") es: " + potencia(base, exponente));
        n.close();
    }
    static int potencia(int base, int exponente)
    {
        
        int resultado = 1; 

    for (int i = 0; i < exponente; i++) { 
        resultado *= base; 
    }

    return resultado;

    }
}
