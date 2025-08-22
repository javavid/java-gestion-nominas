package eventosDeportivos;

public class NombreNoValidoExcepcion extends Exception {
    
    private String nombre;

    public NombreNoValidoExcepcion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return " Nombre (" + nombre + ") No Valido. ";
    }

}
