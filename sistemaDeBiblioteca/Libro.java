package sistemaDeBiblioteca;

import java.time.LocalDate;

public class Libro {
    
    private String titulo;
    private Autor autor;
    private String editorial;
    private LocalDate fechaPlublicacion;
    private String isbn;// numero identificador de la publicacion de un libro ejemplo: 978-84-123456-7
    private double precio;

    
    public Libro(String titulo, Autor autor, String editorial, LocalDate fechaPlublicacion, String isbn,
            double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPlublicacion = fechaPlublicacion;
        this.isbn = isbn;
        this.precio = precio;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
        " TITULO: " + titulo + 
        "\n AUTOR" + autor + 
        "\n EDITORIAL: " + editorial + 
        "\n FECHAPUBLICACION: " + fechaPlublicacion + 
        "\n ISBN: " + isbn + 
        "\n PRECIO: " + precio;
    }


    

}
