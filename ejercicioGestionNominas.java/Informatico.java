

public abstract class Informatico extends Trabajador {

    protected String titulacion;

    public Informatico(String nombre, int cedula, double salarioBase, String titulacion) {
        super(nombre, cedula, salarioBase);
        this.titulacion = titulacion;
    }
    
}
// cd ejercicioGestionNominas.java
// javac Trabajador.java Informatico.java