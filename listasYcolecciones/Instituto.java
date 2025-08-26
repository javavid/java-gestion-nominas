package listasYcolecciones;

import java.util.Iterator;

public class Instituto {
    
    public static void main(String[] args) {
        

        Grupo grupo = new Grupo("A");

        grupo.agregarGrupos(new Alumno("salomon", "vanegas", 13));
        grupo.agregarGrupos(new Alumno("sofia", "palmers", 12));
        grupo.agregarGrupos(new Alumno("sebastian", "furtido", 11));
        grupo.agregarGrupos(new Alumno("vanesa", "suarez", 14));

        Iterator<Alumno> alumnos = grupo.iterator();
        while (alumnos.hasNext())
        {
            System.out.println(alumnos.next());    
        }
    }
}
