package eventosDeportivos;

public class ParticipantesCarrera extends Participantes {

    private int tiempoRegistrado;

    public ParticipantesCarrera(String nombre, String apellido, int edad, int tiempoRegistrado) {
        super(nombre, apellido, edad);
        this.tiempoRegistrado = tiempoRegistrado;
    }

    public int getTiempoRegistrado() {
        return tiempoRegistrado;
    }

    public void setTiempoRegistrado(int tiempoRegistrado) {
        this.tiempoRegistrado = tiempoRegistrado;
    }

    @Override
    public String toString() {
        return 
        super.toString() + 
        "\ntiempoRegistrado: " + tiempoRegistrado;
    }

    
}
