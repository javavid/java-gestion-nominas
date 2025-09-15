package sistemaanalisisdetexto;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnalizadorDeTexto implements I_AnalizarPalabras {
    
    private String texto;
    private Map<String, Integer> palabras;


    public AnalizadorDeTexto(String texto) {
        this.texto = texto != null ? texto : "";
        this.palabras = new HashMap<>();
        procesarTexto();

    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public Map<String, Integer> getPalabras() {
        return palabras;
    }
    public void setPalabras(Map<String, Integer> palabras) {
        this.palabras = palabras;
    }
    @Override
    public List<String> PalabrasMasFrecuentes(int n) {
        
        return palabras.entrySet().stream()
        .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
        .limit(n)
        .map(entry -> entry.getKey() + "(" + entry.getValue() + ")")
        .collect(Collectors.toList());
 
    }
    @Override
    public List<String> PalabrasMenosFrecuentes(int n) {
    return palabras.entrySet().stream()
        .sorted(Map.Entry.comparingByValue()) 
        .limit(n) 
        .map(Map.Entry::getKey)  
        .collect(Collectors.toList());
    }
    @Override
    public Map<Integer, List<String>> PalabrasPorLongitud() {
    return palabras.keySet().stream()
        .collect(Collectors.groupingBy(
            String::length,                      
            Collectors.mapping(
                palabra -> palabra,
                Collectors.collectingAndThen(
                    Collectors.toCollection(ArrayList::new),
                    lista -> {
                        lista.sort(String::compareTo);
                        return lista;
                    }
                )
            )
        ));

    }
    
     private void procesarTexto() {
        String[] tokens = texto.toLowerCase().split("\\W+");
    for (String palabra : tokens) {
        if (!palabra.isEmpty()) {
            palabras.put(palabra, palabras.getOrDefault(palabra, 0) + 1);
        }
    }

    }
    
}
