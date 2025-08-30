package listasYcolecciones;

import java.util.Iterator;

public class Instituto {
    
    public static void main(String[] args) {
        

        Grupo grupo = new Grupo("A");

        grupo.agregarAlumnoss(new Alumno("salomon", "vanegas", 19));
        grupo.agregarAlumnoss(new Alumno("sofia", "palmers", 20));
        grupo.agregarAlumnoss(new Alumno("sebastian", "furtido", 16));
        grupo.agregarAlumnoss(new Alumno("vanesa", "suarez", 14));
        grupo.agregarAlumnoss(new Alumno("pepe", "pinaes", 17));
        grupo.agregarAlumnoss(new Alumno("ana", "alastor", 12));
        grupo.agregarAlumnoss(new Alumno("pedro", "menez", 18));
        grupo.agregarAlumnoss(new Alumno("shascha", "zuñiga", 9));

        grupo.eliminarPorEdad(14);


        grupo.listarAlumnos();

        // aqui se itera el metodo de la clase grpo que a su vez implementa la clase IteradorGrupo.
        /*Iterator<Alumno> alumnos = grupo.iterator();
        while (alumnos.hasNext())
        {
            System.out.println(alumnos.next());    
        }*/

        /*for (Alumno alumno : grupo) {
            System.out.println(alumno);
        }*/
    }
}
