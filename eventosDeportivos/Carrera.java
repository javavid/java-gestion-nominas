package eventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo{
    
    private double distancia;
    private int tiempoRegistrado;

    

    public Carrera(String nombre, LocalDate fecha, String lugar, ArrayList<Participantes> participante,
            double distancia, int tiempoRegistrado) {
        super(nombre, fecha, lugar, participante);
        this.distancia = distancia;
        this.tiempoRegistrado = tiempoRegistrado;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTiempoRegistrado() {
        return tiempoRegistrado;
    }

    public void setTiempoRegistrado(int tiempoRegistrado) {
        this.tiempoRegistrado = tiempoRegistrado;
    }

    @Override
    public ArrayList<Participantes> obtenerGanador() {
        
        return null;
    }

    
    
}
