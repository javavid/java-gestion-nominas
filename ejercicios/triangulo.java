package ejercicios;
import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int base, altura;

        System.out.println("Introduce la base del triángulo:");
        base = n.nextInt();
        System.out.println("Introduce la altura del triángulo:");
        altura = n.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (j == base / 2 - i || j == base / 2 + i || i == altura - 1) {
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
