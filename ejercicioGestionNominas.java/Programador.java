public class Programador extends Informatico{
    
    public Programador(String nombre, int cedula, double salarioBase, String titulado) {
        super(nombre, cedula, salarioBase, titulado);
        
    }

     @Override
   public double complemento()
   {
     return getSalarioBase() + (getSalarioBase() * 0.15);
   }

     @Override
    public String toString()
        {
            return 
            "NOMBRE: " + getNombre() + 
            "\n CEDULA: " + getCedula() + 
            "\n SALARIOBASE: " + getSalarioBase() +
            "\n SALARIOFINAL: " + complemento();
        }

   
}
