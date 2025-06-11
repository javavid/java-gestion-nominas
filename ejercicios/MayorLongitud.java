package ejercicios;
import java.util.Scanner;

public class MayorLongitud {
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);

        int conta = 0;
        String palabra;
        String mayorLong = "";

        while (conta < 5) {
            System.out.println("Introduzca la palabra");
            palabra = n.nextLine();
            
            if (palabra.length() > mayorLong.length()) {
                mayorLong = palabra;
            }

            conta++;
        }
        System.out.println("la palabra con mayor longitud es: " + mayorLong);
        n.close();
    }
}
