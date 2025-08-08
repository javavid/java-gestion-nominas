package sistemaDeBiblioteca;

import java.util.ArrayList;



public class Biblioteca {
    
    private ArrayList<Libro>libro;

    public Biblioteca() {
        this.libro = (libro != null)? new ArrayList<>(libro) :new ArrayList<>();
    }

    public ArrayList<Libro> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<Libro> libro) {
        this.libro = libro;
    }

    public void agregarLibro(Libro libro)
    {

        if (libro != null) { 

            this.libro.add(libro); 
    
        }
}


    public void eliminarLibro(String title) throws LibroNoEncontrado
    {
        for(int i = 0; i < libro.size(); i++) {
            Libro li = libro.get(i);
            if (li.getTitulo().equals(title)) {
                this.libro.remove(i);
                return ;
                
            }
            
        }
        
        throw new LibroNoEncontrado(title);

    }

}
