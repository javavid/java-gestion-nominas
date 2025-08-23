package eventosDeportivos;

public class Participantes {
    
    private String nombre;
    private String apellido;
    private int edad;
    
    public Participantes(String nombre, String apellido, int edad) throws Exception
    {
        if (nombre == null || nombre.length() == 0) {
            throw new NombreNoValidoExcepcion();
        }

        if (apellido == null || apellido.length() == 0) {
            throw new ApellidoNoValidoExcepcion();
        }

        if (edad < 14) {
            throw new EdadNoValidaExcepcion();
        }

        
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return 
        "\nnombre: " + nombre + 
        "\napellido: " + apellido + 
        "\nedad=" + edad;
    }

    
    
}
