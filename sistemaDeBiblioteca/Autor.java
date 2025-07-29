package sistemaDeBiblioteca;

import java.time.LocalDate;

public class Autor extends Persona {
    
 private TipoLiterario generoLiterio;

 public Autor(String nombre, String apellido, LocalDate fechaNacimiento, TipoLiterario generoLiterio) {
    super(nombre, apellido, fechaNacimiento);
    this.generoLiterio = generoLiterio;
 }

 public TipoLiterario getGeneroLiterio() {
    return generoLiterio;
 }

 public void setGeneroLiterio(TipoLiterario generoLiterio) {
    this.generoLiterio = generoLiterio;
 }

}
