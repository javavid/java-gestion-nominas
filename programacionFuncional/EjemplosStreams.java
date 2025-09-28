package programacionFuncional;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EjemplosStreams {
    

    public static void main(String[] args) {
        

        List<String> nombres = List.of("lucia", "paola", "abigaill", "violet", "jocelyn");

        List<String> nombresFiltrados = nombres.stream()
        .filter(n -> n.contains("e"))
        .collect(Collectors.toList());
        System.out.println(nombresFiltrados);
        System.out.println(" ");
        System.out.println(" ");


        List<String> lenguajes = List.of(
        "Java", "C#", "PHP", 
        "JavaScript", "Kotlin", "Flutter",
        "TypeScript", "Python", "Dart", 
        "Java", "Java", "PHP", 
        "PHP", "TypeScript", "C#");

        Set<String> lenguajesFiltrados = lenguajes.stream()
        .filter(l -> l.length() <= 6)
        .map(String::toUpperCase)
        .sorted()
        .collect(Collectors.toSet());
        System.out.println(lenguajesFiltrados);
        System.out.println(" ");
        System.out.println(" ");


        List<String> dbs = List.of(
            "MySQL", "Oracle", 
            "Postgrets", "SQLlite", 
            "Firebase", "Azure", 
            "Aws", "SQLserver");
            String dataBase = dbs.stream()
            .map(String::toUpperCase)
            .collect(Collectors.joining(" : "));
            System.out.println(dataBase);
            System.out.println(" ");
            System.out.println(" ");


            List<String> dbs2 = List.of(
            "MySQL", "Oracle", 
            "Postgrets", "SQLlite", 
            "Firebase", "Azure", 
            "Aws", "SQLserver");
            long dataBase2 = dbs2.stream()
            .filter(bd -> bd.startsWith("A")) // encontrar los primeros que empiecen con la primera letra.
            .collect(Collectors.counting());// el counting() devielve un long. por lo tanto la variable dataBse2 debe ser long.
            System.out.println("Cantidad de BDS con A: " + dataBase2);
            System.out.println(" ");
            System.out.println(" ");

            List<Integer> edades = List.of(
    2, 4, 6, 8, 10, 
                12, 14, 16, 18, 20, 
                22, 24, 26, 28, 30, 
                32, 34, 36, 38, 40, 
                42, 44, 46, 48, 50, 
                52, 54, 56, 58, 60); 

                Map<Boolean, List<Integer>> mayores = edades.stream()
                .collect(Collectors.partitioningBy(e -> e > 20));// si es falso se asigna en el booleano del Map<> y si es verdadero en la List<> de enteros del Map.
                System.out.println(mayores);
                System.out.println(" ");
                System.out.println(" ");
        
    }
}
