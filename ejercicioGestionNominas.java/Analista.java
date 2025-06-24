public class Analista extends Informatico{
    
    public Analista(String nombre, int cedula, double salarioBase, String titulacion) {
        super(nombre, cedula, salarioBase, titulacion);
        
        
    }

    @Override
   public double complemento()
   {
     return getSalarioBase() + (getSalarioBase() * 0.30);
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
