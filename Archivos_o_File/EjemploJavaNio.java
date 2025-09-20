package Archivos_o_File;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class EjemploJavaNio {
    

    public static void main(String[] args) {
        
        try {
            List<String> lines = Arrays.asList("Hola", "Mundo", "Desde", "Java", "Nio");
        Path fichero = Paths.get("filesNio.txt");
            Files.write(fichero, lines, StandardCharsets.UTF_8);
            List<String> lineasLeidas = Files.readAllLines(fichero, StandardCharsets.UTF_8);
            for (String fiche : lineasLeidas) {
                System.out.println(fiche);
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }

        
    }
}
