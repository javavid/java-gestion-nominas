
package gestion_equipos_de_futbol_collections_funcional;


import java.util.List;

public class AplicacinPruebas {
    
    public static void main(String[] args) {
        
       
        Equipo equipo = new Equipo("Bayer");
        ValidarFutbolistas validarFutbolistas = new ValidarFutbolistas();
        //ivalidarFutbolistas.setValidacionFutbolistas(new ValidacionFutbolistas());

        
        List<Futbolista> plantel = List.of(
        new Futbolista("Luis Dias", 27, Posicion.DELANTERO),
        new Futbolista("Harry kene", 27, Posicion.DELANTERO),
        new Futbolista("Manuel Neuer", 39, Posicion.PORTERO),
        new Futbolista("Sven Ulreich", 27, Posicion.PORTERO),
        new Futbolista("Jonas Urbig", 22, Posicion.PORTERO),
        new Futbolista("Leon Klanac", 18, Posicion.PORTERO),
        new Futbolista("Tom Bischof", 20, Posicion.CENTROCAMPISTA),
        new Futbolista("Leon Goretzka", 30, Posicion.CENTROCAMPISTA),
        new Futbolista("Joshua Kimmich", 30, Posicion.CENTROCAMPISTA),
        new Futbolista("Jamal Musiala", 22, Posicion.CENTROCAMPISTA),
        new Futbolista("Aleksandar Pavlovic", 21, Posicion.CENTROCAMPISTA),
        new Futbolista("Lennart Karl", 17, Posicion.CENTROCAMPISTA),
        new Futbolista("Dayot Upamecano", 26, Posicion.DEFENSA),
        new Futbolista("Kim Min-Jae", 28, Posicion.DEFENSA),
        new Futbolista("Jonathan Tah", 29, Posicion.DEFENSA),
        new Futbolista("Hiroki Ito", 26, Posicion.DEFENSA),
        new Futbolista("Alphonso Davies", 24, Posicion.DEFENSA),
        new Futbolista("Raphaël Guerreiro", 31, Posicion.DEFENSA),
        new Futbolista("Serge Gnabry", 30, Posicion.DELANTERO),
        new Futbolista("Michael Olise", 23, Posicion.DELANTERO),
        new Futbolista("Jonah Kusi-Asare", 18, Posicion.DELANTERO),
        new Futbolista("Wisdom Mike", 16, Posicion.DELANTERO)
        );

        validarFutbolistas.forvalidador(plantel, equipo);

        equipo.listarFormacionEquipo();

        /*for (Futbolista jugador : plantel) {
            try {
                validacionFutbolistas.validarFutbolista(jugador);
                validacionFutbolistas.getFutbolistas().add(jugador);
                equipo.agrgarFutbolista(jugador);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }*/
    }
}
