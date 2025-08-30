package listasYcolecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Grupo implements Iterable<Alumno>{

    private String nombreGrupo;
    private ArrayList<Alumno> alumnos;


    public Grupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
        this.alumnos = new ArrayList<>();
    }
    
    public String getNombreGrupo() {
        return nombreGrupo;
    }
    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumnoss(Alumno alumno)
    {
        alumnos.add(alumno);
    }

    public void eliminarPorEdad(int n)
    {
        Iterator<Alumno> alummnos = alumnos.iterator();
        while (alummnos.hasNext()) {
            if (alummnos.next().getEdad() < n) alummnos.remove(); {
                
            }
        }
    }

    @Override
    public Iterator<Alumno> iterator() {
        // se implementa o se instancia la clase IteradorGrupo.
        // la cual tiene una condicion, que los Alumnos de igual o menor edad a 14 no se impriman.
        // si son mallores si se imprimiran.
        return new IteradorGrupo(alumnos);
    }

    
}
