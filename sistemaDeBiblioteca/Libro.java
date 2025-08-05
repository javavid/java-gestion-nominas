package sistemaDeBiblioteca;

import java.time.LocalDate;

public class Libro {
    
    private String tutulo;
    private Autor autor;
    private String editorial;
    private LocalDate fechaPlublicacion;
    private String isbn;// numero identificador de la publicacion de un libro ejemplo: 978-84-123456-7
    private double precio;

    
    public Libro(String tutulo, Autor autor, String editorial, LocalDate fechaPlublicacion, String isbn,
            double precio) {
        this.tutulo = tutulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPlublicacion = fechaPlublicacion;
        this.isbn = isbn;
        this.precio = precio;
    }


    public String getTutulo() {
        return tutulo;
    }


    public void setTutulo(String tutulo) {
        this.tutulo = tutulo;
    }


    public Autor getAutor() {
        return autor;
    }


    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    public String getEditorial() {
        return editorial;
    }


    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public LocalDate getFechaPlublicacion() {
        return fechaPlublicacion;
    }


    public void setFechaPlublicacion(LocalDate fechaPlublicacion) {
        this.fechaPlublicacion = fechaPlublicacion;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return 
        "tutulo " + tutulo + 
        "autor " + autor + 
        "editorial " + editorial + 
        "fechaPlublicacion " + fechaPlublicacion + 
        "isbn " + isbn + 
        "precio " + precio;
    }


    

}
