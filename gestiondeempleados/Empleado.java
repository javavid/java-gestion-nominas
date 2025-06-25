package gestiondeempleados;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private int cedula;
    private double salario;


    public Empleado(String nombre, String apellido, int cedula, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.salario = salario;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getCedula() {
        return cedula;
    }


    public void setCedula(int cedula) {
        this.cedula = cedula;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario(); 
    

    @Override
    public String toString()
    {
        return
        
        "NOMBRE: " + getNombre() + 
        "\n APELLIDO: " + getApellido() +
        "\n CEDULA: " + getCedula() +
        "\n SALARIO: " + getSalario(); 
            
    }
    
}
