package ejercicios;
/*
 * Crea un metodo que dado un numero, lo imprima invertido por pantalla.
 */

import java.util.Scanner;

public class NumInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println("Número invertido: " + invertirNumero(numero));

    }

    public static int invertirNumero(int numero) {
        int numeroInvertido = 0;
        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }
        return numeroInvertido;
    }
}