package ejercicios;
/*crea un metodo que obtenga la cantidad de digitos de un numero N mayor que cero.
 * Se debe pasar por parametro el numero N.
 */

import java.util.Scanner;

public class NDigitos {
    public static void main(String[] args) {
        

        Scanner n = new Scanner(System.in);
        System.out.println("digite un numero cualquiera");
        int num = n.nextInt();
        digitos(num);
        System.out.println("La catidad de digitos del numero ingresado es de: " + digitos(num));
       
        n.close();
    }

    static int digitos(int n)
    {
        int cantidad = String.valueOf(n).length();
        return cantidad;
    }
}
