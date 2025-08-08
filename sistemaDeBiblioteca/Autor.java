package sistemaDeBiblioteca;

import java.time.LocalDate;

public class Autor extends Persona {
    
 private TipoLiterario generoLiterario;

 public Autor(String nombre, String apellido, LocalDate fechaNacimiento, TipoLiterario generoLiterio) {
    super(nombre, apellido, fechaNacimiento);
    this.generoLiterario = generoLiterio;
 }

 public TipoLiterario getGeneroLiterario() {
    return generoLiterario;
 }

 public void setGeneroLiterario(TipoLiterario generoLiterario) {
    this.generoLiterario = generoLiterario;
 }

 @Override
 public String toString() {
   return
    " [" + super.toString() +
   ", GENEROLITERARIO: " + generoLiterario + " ]\n";
    

 }

}
