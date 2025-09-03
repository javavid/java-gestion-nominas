package listasYcolecciones;

public class Alumno /*implements Comparable<Alumno>*/{
    private String nombre;
    private String apellido;
    private int edad;

    
    public Alumno(String nombre, String apellido, int edad) {
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
        "\nNOMBRE= " + nombre; /*+ 
        ", APELLIDO= " + apellido + 
        ", EDAD= " + edad;*/
    }


    // metodos hashCode y equals para la interface Set<E> y HasSet<E>.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + edad;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (edad != other.edad)
            return false;
        return true;
    }


   /*  @Override
    public int compareTo(Alumno a) {
        int comparacion = Integer.compare(this.edad, a.edad);// ordena por edad. si cambian el orden del .compare asi (a.edad, this.edad) ordenara de mayor a menor.
        if (comparacion == 0 ) comparacion = this.nombre.compareTo(a.nombre);// si la edad son las mismas ordena por nombre en forma alfabetica.
        return comparacion;
    }*/

    
}
