public class Administrativo extends Gestion{
    
    public Administrativo(String nombre, int cedula, double salarioBase, int antiguedad) {
        super(nombre, cedula, salarioBase, antiguedad);
        
    }

    @Override
    public double complemento()
    {
        return getSalarioBase() + (antiguedad * 20);
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
