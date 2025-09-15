package sistemaanalisisdetexto;

public class PruebasAnalizadorTexto {
    
    public static void main(String[] args) {
        
        AnalizadorDeTexto analizadorDeTexto = new AnalizadorDeTexto("Java es un lenguaje de programación. Java permite desarrollar aplicaciones. Las aplicaciones en Java pueden ser móviles, web o de escritorio. Programar en Java es divertido y poderoso. El lenguaje Java es muy popular entre los desarrolladores.");
        System.out.println(" ***( Palabras Con Mas Frecuencia )*** ");
        analizadorDeTexto.PalabrasMasFrecuentes(10).forEach(System.out::println);
        System.out.println(" ");
        System.out.println(" ***( Palabras Con Menos Frecuencia )*** ");
        analizadorDeTexto.PalabrasMenosFrecuentes(10).forEach(System.out::println);
        System.out.println(" ");
        System.out.println(" ***( Longitud, Palabras y Ordenamiento )*** ");
        analizadorDeTexto.PalabrasPorLongitud().forEach((longitud, lista) -> {
    System.out.println("Longitud " + longitud + ": " + lista);
});
    }
}
