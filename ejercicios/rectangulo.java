package ejercicios;
import java.util.Scanner;

public class rectangulo {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int base, altura;

        System.out.println("Introduce la base del rectángulo:");
        base = n.nextInt();
        System.out.println("Introduce la altura del rectángulo:");
        altura = n.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        n.close();
        
    }
}