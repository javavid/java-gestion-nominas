package ejercicios;

;

public class Burbuja {
    public static void main(String[] args) {
        
        int[] num = {5,7,3,9,1,4,2,8,6};
        int aux = 0; 
        for (int i = num.length-1; i > 0; i--) {
            for (int j = 0; j < num.length; j++) {
                if (aux < num[i]) {
                    aux = num[j];
                    num[i] = aux;
                    System.out.println(num[i]);
                }
            }
            
        }
        
    }
}
