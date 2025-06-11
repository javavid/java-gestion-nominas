package ejercicios;
public class Borde_1 {

    /*
     * Ejercicio para realizar despues con mas tiempo.
     */

    static final char ESI = '┌';// Esquina Superior Izquierda.
    static final char HORIZONTAL = '─';
    static final char ESD = '┐';// Esquina Superior Derecha.
    static final char VERTICAL = '│';
    static final char EID = '┘';// Esquina Inferior Derecha.
    static final char EII = '└';// Esquina Inferior Isquierda.
    static final char SEPARADOR = '┬';
    public static void main(String[] args) {

        //Ejemplo: de bordes.

        /*int ancho = 20;
        int alto = 10;

        // Imprimir la línea superior
        System.out.print(ESI);
        for (int i = 0; i < ancho - 2; i++) {
            System.out.print(HORIZONTAL);
        }
        System.out.println(ESD);

        // Imprimir los lados verticales
        for (int i = 0; i < alto - 2; i++) {
            System.out.print(VERTICAL);
            for (int j = 0; j < ancho - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(VERTICAL);
        }

        // Imprimir la línea inferior
        System.out.print(EII);
        for (int i = 0; i < ancho - 2; i++) {
            System.out.print(HORIZONTAL);
        }
        System.out.println(EID);*/
    




        int[] num = {1,2,3,4,5,6,7,8,9};

        System.out.print(ESI);
        for (int j = 0; j < num.length; j++)
        {
            if (j < num.length) {
                System.out.print(HORIZONTAL);
            }
            
        }
        System.out.println(ESD);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        
    }
}