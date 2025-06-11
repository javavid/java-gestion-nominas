package ejercicios;
public class MatrizDiagonal {
    public static void main(String[] args) {
        int dimension = 4;
        int[][] ma = crearMatriz(dimension);
        imprimirMtriz(ma);
    }
    static int[][] crearMatriz(int n)
    {
         int[][] matri = new int[n][n];
        return matri;
    }

    static void imprimirMtriz(int[][] m)
    {
        for (int f = 0; f < m.length; f++)
        {
            for (int c = 0; c < m[f].length; c++)
            {
                if (f == c)
                {
                    System.out.print( "X ");
                }
                else
                {
                    System.out.print("- ");
                }
            }
            System.out.println(" ");    
        }
    }
}
