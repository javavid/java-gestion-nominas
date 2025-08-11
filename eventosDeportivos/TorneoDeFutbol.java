package eventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo{
    
    private ArrayList<Equipos> equipos;
    private int puntosAcumulados;

    public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar, ArrayList<Participantes> participante,
            ArrayList<Equipos> equipos, int puntosAcumulados) {
        super(nombre, fecha, lugar, participante);
        this.equipos = equipos;
        this.puntosAcumulados = puntosAcumulados;
    }

    public ArrayList<Equipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipos> equipos) {
        this.equipos = equipos;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    @Override
    public ArrayList<Participantes> obtenerGanador() {
        
        return null;
    }
}
