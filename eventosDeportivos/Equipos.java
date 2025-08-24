package eventosDeportivos;

import java.util.ArrayList;



public class Equipos extends Participantes {
    
    private String nombreEquipo;
    private ArrayList<Participantes> participantes;
    private int puntos = 0;


    

    public Equipos(String nombre, String apellido, int edad, String nombreEquipo, int puntos) throws Exception {
        super(nombre, apellido, edad);
        this.nombreEquipo = nombreEquipo;
        this.participantes = new ArrayList<>();
        this.puntos = puntos;
    }


    public void eliminarJugador(String nombre, String apellido) throws JugadorNoEncontrado
    {
        for(int i = 0; i < participantes.size(); i++) {
            Participantes pa = participantes.get(i);
            if (pa.getNombre().equals(nombre) && pa.getApellido().equals(apellido)) {
                this.participantes.remove(i);
                return ;
                
            }
            
        }
        
        throw new JugadorNoEncontrado(nombre, apellido);

    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }


    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }


    public ArrayList<Participantes> getParticipantes() {
        return participantes;
    }


    public void setParticipantes(ArrayList<Participantes> participantes) {
        this.participantes = participantes;
    }


    public int getPuntos() {
        return puntos;
    }


    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return 
        "\nnombre: " + nombreEquipo + 
        "\nparticipantes: " + participantes + 
        "\npuntos=" + puntos;
    }

}
