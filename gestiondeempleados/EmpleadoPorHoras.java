package gestiondeempleados;

public class EmpleadoPorHoras extends Empleado {
    
    private int hoarasTrabajadas;
    private double tarifaPorHora;


    public EmpleadoPorHoras(String nombre, String apellido, int cedula, double salario, int hoarasTrabajadas, double tarifaPorHora) {
        super(nombre, apellido, cedula, salario);
        this.hoarasTrabajadas = hoarasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHoarasTrabajadas() {
        return hoarasTrabajadas;
    }

    public void setHoarasTrabajadas(int hoarasTrabajadas) {
        this.hoarasTrabajadas = hoarasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario()
    {
        return hoarasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString()
        {
            return 
            "NOMBRE: " + getNombre() +
            "\n APELLIDO: " + getApellido() + 
            "\n CEDULA: " + getCedula() + 
            "\n SALARIO: " + getSalario() +
            "\n HORASTRABAJADAS: " + getHoarasTrabajadas() +
            "\n TARIFAPORHORAS: " + getTarifaPorHora() +
            "\n SALARIOCALCULADO: " + calcularSalario();
            
        }

    
}
