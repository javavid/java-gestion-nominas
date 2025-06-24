public abstract class Trabajador {
    
    private String nombre;
    private int cedula;
    private double salarioBase;
    
    
    public Trabajador(String nombre, int cedula, double salarioBase) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salarioBase = salarioBase;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double complemento();
    
}
