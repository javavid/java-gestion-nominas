package listasYcolecciones;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class IteradorGrupo implements Iterator<Alumno>{

    private List<Alumno>alumnos;
    private int posicion = 0;


    public IteradorGrupo(List<Alumno> alumnos) {
        this.alumnos = alumnos;
        
    }

    @Override
    public boolean hasNext() {
        while (posicion < alumnos.size() && alumnos.get(posicion).getEdad() <= 14) {
            posicion++;
        }
        return posicion < alumnos.size();
    }

    @Override
    public Alumno next() {
        // Usando un Iterator y llamas a .next() sin verificar si hay más elementos con .hasNext().
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return alumnos.get(posicion++);
    }
    


}
