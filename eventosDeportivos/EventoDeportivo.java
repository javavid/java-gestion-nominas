package eventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador {
    
    private String nombre;
    private LocalDate fecha;
    private String lugar;
    
    
    public EventoDeportivo(String nombre, LocalDate fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        

        
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

    public abstract void inscribirParticipante(Participantes participante);
    
    
    @Override
    public abstract ArrayList<Participantes> obtenerGanador();
}