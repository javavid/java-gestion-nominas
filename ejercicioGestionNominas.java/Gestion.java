public abstract class Gestion extends Trabajador{

    protected int antiguedad;
    
    public Gestion(String nombre, int cedula, double salarioBase, int antiguedad) {
        super(nombre, cedula, salarioBase);
        this.antiguedad = antiguedad;
    }

    
}
