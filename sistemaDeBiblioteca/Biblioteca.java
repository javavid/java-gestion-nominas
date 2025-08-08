package sistemaDeBiblioteca;

import java.util.ArrayList;

import gestiondeempleados.EmpleadoNoEncontradoException;

public class Biblioteca {
    
    private ArrayList<Libro>libro;

    public Biblioteca(ArrayList<Libro> libro) {
        this.libro = (libro != null)? new ArrayList<>(libro) :new ArrayList<>();
    }

    public ArrayList<Libro> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<Libro> libro) {
        this.libro = libro;
    }

    public void agregarEmpleado(Libro libro)
    {

        if (libro != null) { 

            this.libro.add(libro); 
    
        }
}


    public void eliminirEmpleado(String isbnn) throws EmpleadoNoEncontradoException
    {
        for(int i = 0; i < libro.size(); i++) {
            Libro emple = libro.get(i);
            if (emple.getIsbn().equals(isbnn)) {
                this.libro.remove(i);
                return ;
                
            }
            
        }
        
        throw new EmpleadoNoEncontradoException(isbnn);

    }

}
