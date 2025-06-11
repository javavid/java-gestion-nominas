package ejercicios;
import java.util.Scanner;

public class mayormenor {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        int N, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, numIntro, C = 0;

        System.out.println("¿Cuántos números quieres introducir?");
        N = n.nextInt();

        while (C < N) {
            System.out.println("Introduce un número:");
            numIntro = n.nextInt();

            if (numIntro > mayor) {
                mayor = numIntro;
            }
            if (numIntro < menor) {
                menor = numIntro;
            }
            C++;
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        n.close();
    }
}

