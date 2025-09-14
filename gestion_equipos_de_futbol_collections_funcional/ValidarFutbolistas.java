package gestion_equipos_de_futbol_collections_funcional;


import java.util.List;

public class ValidarFutbolistas {
    
    
    private ValidacionFutbolistas validacionFutbolistas;
    

    
    public ValidarFutbolistas( ) {
        this.validacionFutbolistas = new ValidacionFutbolistas();
    }

    

    public ValidacionFutbolistas getValidacionFutbolistas() {
        return validacionFutbolistas;
    }

    public void setValidacionFutbolistas(ValidacionFutbolistas validacionFutbolistas) {
        this.validacionFutbolistas = validacionFutbolistas;
    }

    public void forvalidador(List<Futbolista> futbolista, Equipo equipo)
    {
       
        for (Futbolista jugador : futbolista) {
            try {
                validacionFutbolistas.validarFutbolista(jugador);
                validacionFutbolistas.getFutbolistas().add(jugador);
                equipo.agrgarFutbolista(jugador);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
