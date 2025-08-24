package eventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo{
    
    private double distancia;

    ArrayList<ParticipantesCarrera> participantesCarrera;

    public Carrera(String nombre, LocalDate fecha, String lugar,double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
        this.participantesCarrera = new ArrayList<>();
        
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public ArrayList<ParticipantesCarrera> getParticipantesCarrera() {
        return participantesCarrera;
    }

    public void setParticipantesCarrera(ArrayList<ParticipantesCarrera> participantesCarrera) {
        this.participantesCarrera = participantesCarrera;
    }

    @Override
    public ArrayList<Participantes> obtenerGanador() {
        ArrayList<Participantes> ganador = new ArrayList<>();
        if (participantesCarrera == null || participantesCarrera.isEmpty()) {
            return ganador;
        }

        ParticipantesCarrera partcrr = participantesCarrera.get(0);

            for (ParticipantesCarrera p : participantesCarrera) {
                if (p.getTiempoRegistrado() < partcrr.getTiempoRegistrado()) {
                    partcrr = p;
                }
            }
            ganador.add(partcrr);
            return ganador;
        
    }

    @Override
    public String toString() {
        return 
        super.toString() +
        "distancia= " + distancia + 
        "participantesCarrera= " + participantesCarrera +
        "obtenerGanador= " + obtenerGanador();
    }

    @Override
    public void inscribirParticipante(Participantes participante) {
        if (participante instanceof ParticipantesCarrera) {
    participantesCarrera.add((ParticipantesCarrera) participante);
}
        
    }
    
    
}
