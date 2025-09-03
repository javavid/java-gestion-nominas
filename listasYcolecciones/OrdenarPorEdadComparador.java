package listasYcolecciones;

import java.util.Comparator;

class OrdenarPorEdadComparador implements Comparator<Alumno> {

    @Override
    public int compare(Alumno a1, Alumno a2) {
        int comparacion = Integer.compare(a1.getEdad(), a2.getEdad());//compara edades.
        if (comparacion == 0 ) comparacion = a1.getNombre().compareTo(a2.getNombre());// si la edad son las mismas ordena por nombre en forma alfabetica.
        return comparacion;
    }

     
}