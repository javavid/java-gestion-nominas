package listasYcolecciones;


import java.util.LinkedList;

public class Instituto3_LinkedList {
    public static void main(String[] args) {
        
        LinkedList<Alumno> alumnos = new LinkedList<>();

        // metodos interface collections.
        alumnos.add(new Alumno("salomon", "vanegas", 19));
        alumnos.add(new Alumno("sofia", "palmers", 20));
        alumnos.add(new Alumno("sebastian", "furtido", 16));
        alumnos.add(new Alumno("vanesa", "suarez", 14));
        alumnos.add(new Alumno("pepe", "pinaes", 17));
        alumnos.add(new Alumno("ana", "alastor", 12));
        alumnos.add(new Alumno("pedro", "menez", 18));
        alumnos.add(new Alumno("shascha", "zuñiga", 9));


        // metodos interface List.
        alumnos.set(2, new Alumno("Violet", "terns", 13));
        alumnos.add(2,new Alumno("phineas", "mandez", 14));


        // metodos interface Queue y Deque.
        alumnos.pollFirst();
        alumnos.pollLast();
        alumnos.offerFirst(new Alumno("seya", "de athena", 17));
        alumnos.offerLast(new Alumno("shiryu", "de athena", 19));
        System.out.println(alumnos.removeFirst());
        System.out.println(alumnos.removeLast());
        System.out.println(alumnos);

    }
}
