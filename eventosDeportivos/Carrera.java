package eventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo{
    
    private double distancia;

    ArrayList<ParticipantesCarrera> participantesCarrera;
    

    

    public Carrera(String nombre, LocalDate fecha, String lugar, ArrayList<Participantes> participante,
            double distancia, ArrayList<ParticipantesCarrera> participantesCarreras ) {
        super(nombre, fecha, lugar, participante);
        this.distancia = distancia;
        this.participantesCarrera = participantesCarreras;
        
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
        for (int i = 0; i < ganador.size(); i++) {
            Participantes par = ganador.get(i);
            
        }
        return null;
    }
    
    
}
