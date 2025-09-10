package gestion_equipos_de_futbol_collections_funcional;

import java.util.ArrayList;
import java.util.List;


public class ValidacionFutbolistas {
    
    private List<Futbolista> futbolistas;

    public ValidacionFutbolistas() {
        this.futbolistas = new ArrayList<>();
    }

    public List<Futbolista> getFutbolistas() {
        return futbolistas;
    }

    

    public void validarFutbolista(Futbolista futbolista) throws Exception
    {
        Posicion posicion = futbolista.getPosicion();

            long cantidad = futbolistas.stream()
            .filter(c -> c.getPosicion() == posicion)
            .count();

            if (posicion == Posicion.DEFENSA && cantidad >= 5) {
                throw new DefensaException();
            }
            
            if (posicion == Posicion.CENTROCAMPISTA && cantidad >= 5) {
                throw new CentrocampistasException();
            }

            if (posicion == Posicion.DELANTERO && cantidad >= 4) {
                throw new DelanteroException();
            }

            if (posicion == Posicion.PORTERO && cantidad >= 2) {
                throw new PorteroException();
            }
    }
}
