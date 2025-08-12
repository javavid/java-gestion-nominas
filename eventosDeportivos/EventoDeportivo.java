package eventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador {
    
    private String nombre;
    private LocalDate fecha;
    private String lugar;
    private ArrayList<Participantes> participante;
    
    public EventoDeportivo(String nombre, LocalDate fecha, String lugar, ArrayList<Participantes> participante) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participante = (participante != null)? new ArrayList<>(participante) : new ArrayList<>();

        
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public ArrayList<Participantes> getParticipante() {
        return participante;
    }
    public void setParticipante(ArrayList<Participantes> participante) {
        this.participante = participante;
    }

    public void inscribirParticipante(Participantes participante)
    {
        if(participante != null)
        {
            this.participante.add(participante);
        }
    }
    
    @Override
    public abstract ArrayList<Participantes> obtenerGanador();
}