package ejercicios;
import java.util.Scanner;

public class RecursivoFibonachi {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Introduce un número para calcular Fibonacci:");
        int num = n.nextInt();
        n.close();

        System.out.println("Calculando Fibonacci de " + num + "...");
        int resultado = fibonacci(num);
        System.out.println("Resultado final: " + resultado);

    }

    public static int fibonacci(int n) {
        System.out.println("Llamando a fibonacci(" + n + ")");

        
        if (n == 0) {
            System.out.println("Caso base: fibonacci(0) = 0");
            return 0;
        }
        if (n == 1) {
            System.out.println("Caso base: fibonacci(1) = 1");
            return 1;
        }

        
        int resultado = fibonacci(n - 1) + fibonacci(n - 2);
        System.out.println("Fibonacci(" + n + ") = " + resultado);
        return resultado;


    }
}
