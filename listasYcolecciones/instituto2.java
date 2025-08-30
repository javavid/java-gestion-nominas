package listasYcolecciones;

import java.util.ArrayList;

import java.util.Collections;

public class instituto2 {
    
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("salomon", "vanegas", 19));
        alumnos.add(new Alumno("sofia", "palmers", 20));
        alumnos.add(new Alumno("sebastian", "furtido", 16));
        alumnos.add(new Alumno("vanesa", "suarez", 14));
        alumnos.add(new Alumno("pepe", "pinaes", 17));
        alumnos.add(new Alumno("ana", "alastor", 12));
        alumnos.add(new Alumno("pedro", "menez", 18));
        alumnos.add(new Alumno("shascha", "zuñiga", 9));

        Collections.sort(alumnos);
        System.out.println(alumnos);

        alumnos.add(new Alumno("arequipe", "manzanares", 17));
        alumnos.add(new Alumno("brenda", "merlano", 12));
        alumnos.add(new Alumno("rosa", "bahs", 20));

        System.out.println(" ");
        Collections.sort(alumnos);
        System.out.println(alumnos);
    }
}
