package ejercicios;
public class MaxiCadena {
    public static void main(String[] args) {
        
        String[] cadenas = {"leon", "tigre","jaguarundi", "puma", "jaguar", "leopardo"};

        System.out.println("la cadena mas larga es: " + masLarga(cadenas));

    }
    static String masLarga(String[] cadena)
    {
        String compareCadena = "";
        for (int i = 0; i < cadena.length; i++) {
            if (compareCadena.length() < cadena[i].length())
            {
                 compareCadena = cadena[i];
            }
        }
        return  compareCadena;
    }
}
