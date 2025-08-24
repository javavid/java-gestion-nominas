package eventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo{
    
    private ArrayList<Equipos> equipos;
    

    public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
        
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

    @Override
    public String toString() {
        return 
        super.toString() +
        "equipos= " + equipos;
    }

    @Override
    public void inscribirParticipante(Participantes participante) {
        if (participante instanceof Equipos) {
    equipos.add((Equipos) participante);
}
        
    }

    
    
}
