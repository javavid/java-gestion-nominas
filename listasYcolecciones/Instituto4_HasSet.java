package listasYcolecciones;

import java.util.HashSet;
import java.util.Set;

public class Instituto4_HasSet {
    public static void main(String[] args) {
        
        Set<Alumno> alumno = new HashSet<>();

        Alumno a1 = new Alumno("paola", "nunez", 23);
        Alumno a2 = new Alumno("pamela", "fazma", 30);
        Alumno a3 = new Alumno("pancracio", "trejo", 31);
        Alumno a4 = new Alumno("vartolo", "marsipal", 28);
        Alumno a5 = new Alumno("fabiola", "zocalo", 24);
        Alumno a6 = new Alumno("pamela", "fazma", 30);


        alumno.add(a1);
        alumno.add(a2);
        alumno.add(a3);
        alumno.add(a4);
        alumno.add(a5);
        alumno.add(a6);

        alumno.add(a1);
        alumno.add(new Alumno("paola", "nunez", 36));

        for (Alumno alumno2 : alumno) {
            System.out.println(alumno2);
        }

    }
}
