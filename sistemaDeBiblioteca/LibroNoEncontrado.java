package sistemaDeBiblioteca;

public class LibroNoEncontrado extends Exception {
    
    private String noEncontrado;

    public LibroNoEncontrado(String noencontrado) {
        this.noEncontrado = noencontrado;
    }

    @Override
    public String toString() {
        return " Empleado Con  Cedula " + noEncontrado + " No Existe ";
    }
}
