package gestiondeempleados;

public class EmpleadoFijo extends Empleado {

     private double salarioMensual;

     public EmpleadoFijo(String nombre, String apellido, String cedula, double salario) {
        super(nombre, apellido, cedula, salario);
        this.salarioMensual = salario;
     }

     public double getSalarioMensual() {
         return salarioMensual;
     }

     public void setSalarioMensual(double salarioMensual) {
         this.salarioMensual = salarioMensual;
     }

     @Override
    public double calcularSalario()
    {
        return salarioMensual ;
    }

    @Override
    public String toString()
        {
            return 
            "NOMBRE: " + getNombre() +
            "\n APELLIDO: " + getApellido() + 
            "\n CEDULA: " + getCedula() + 
            "\n SALARIO: " + getSalario() +
            "\n SALARIOMENSUAL: " + getSalarioMensual() +
            "\n SALARIOCALCULADO: " + calcularSalario();
            
        }

}
