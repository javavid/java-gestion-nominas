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

    public void agregarGrupos(Alumno alumno)
    {
        alumnos.add(alumno);
    }

    @Override
    public Iterator<Alumno> iterator() {
        
        return alumnos.iterator();
    }

    
}
