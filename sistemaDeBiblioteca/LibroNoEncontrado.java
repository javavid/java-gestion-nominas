package sistemaDeBiblioteca;

public class LibroNoEncontrado extends Exception {
    
    private String noEncontrado;

    public LibroNoEncontrado(String noencontrado) {
        this.noEncontrado = noencontrado;
    }

    @Override
    public String toString() {
        return " libro con Titulo: (" + noEncontrado + ") No Existe ";
    }
}
