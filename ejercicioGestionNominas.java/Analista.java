public class Analista extends Trabajador{
    
    public Analista(String nombre, int cedula, double salarioBase, double salarioFinal) {
        super(nombre, cedula, salarioBase, salarioFinal);
        
        
    }

    @Override
    public String toString()
        {
            return 
            "NOMBRE: " + getNombre() + 
            "\n CEDULA: " + getCedula() + 
            "\n SALARIOBASE: " + getSalarioBase() +
            "\n SALARIOFINAL: " + getSalarioFinal();
        }
}
