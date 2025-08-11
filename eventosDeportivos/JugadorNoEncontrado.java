package eventosDeportivos;

public class JugadorNoEncontrado extends Exception{
    
    private String nombre;
    private String apellido;

    public JugadorNoEncontrado(String noEncontrado, String apellido) {
        this.nombre = noEncontrado;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return " jugador (" + nombre + apellido + ") No Existe ";
    }
}


