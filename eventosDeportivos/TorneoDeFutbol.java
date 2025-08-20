package eventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo{
    
    private ArrayList<Equipos> equipos;
    

    public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar, ArrayList<Participantes> participante,
            ArrayList<Equipos> equipos) {
        super(nombre, fecha, lugar, participante);
        this.equipos = equipos;
        
    }

    public ArrayList<Equipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipos> equipos) {
        this.equipos = equipos;
    }

    @Override
    public ArrayList<Participantes> obtenerGanador() {
        ArrayList<Participantes> ganador = new ArrayList<>();
        if (equipos == null || equipos.isEmpty()) {
            return ganador;
        }

        Equipos equip = equipos.get(0);

        for (Equipos eq : equipos) {
            if (eq.getPuntos() < equip.getPuntos()) {
                equip = eq;
            }
        }
        ganador.add(equip);
        return ganador;
    }
}
