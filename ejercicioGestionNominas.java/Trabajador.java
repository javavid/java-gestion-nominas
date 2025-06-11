public class Trabajador {
    
    private String nombre;
    private int cedula;
    private double salarioBase;
    private double salarioFinal;
    
    public Trabajador(String nombre, int cedula, double salarioBase, double salarioFinal) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salarioBase = salarioBase;
        this.salarioFinal = salarioFinal;
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

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    
}
