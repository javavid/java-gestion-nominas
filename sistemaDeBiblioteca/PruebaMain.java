package sistemaDeBiblioteca;

import java.time.LocalDate;

public class PruebaMain {
    public static void main(String[] args) {
        
        Biblioteca bi = new Biblioteca();

        
        Autor autor = new Autor("Yefrit", "edwars", LocalDate.of(1980, 9, 13), TipoLiterario.DRAMATICO);
        Autor autor2 = new Autor("lorens", "vanister", LocalDate.of(1974, 2, 19), TipoLiterario.POETICO);

        bi.agregarLibro(new Libro("soledad", autor, "librosTEXT", LocalDate.of(2025, 8, 7), "-123-432-987", 60000));
        bi.agregarLibro(new Libro("amor de primera", autor2, "librosCompany", LocalDate.of(2025, 10, 20), "-321-590-371", 30000));


        for (Libro li : bi.getLibro()) {
            System.out.println(" ");
            System.out.println(li);
        }

        try {
            bi.eliminarLibro("soledad");
        } catch (LibroNoEncontrado e) {
            System.out.println("\n Error " + e);
        }

    }
}
