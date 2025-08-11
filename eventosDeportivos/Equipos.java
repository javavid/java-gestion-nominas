package eventosDeportivos;

import java.util.ArrayList;



public class Equipos {
    
    private String nombre;
    private ArrayList<Participantes> participantes;
    private int puntos = 0;


    public Equipos(String nombre, ArrayList<Participantes> participantes, int puntos) {
        this.nombre = nombre;
        this.participantes = (participantes != null)? new ArrayList<>(participantes) : new ArrayList<>();
        this.puntos = puntos;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    
    public void añadirJugador(Participantes participantes)
    {
        if (participantes != null)
        {
            this.participantes.add(participantes);    
        }
    }

    public void eliminarLibro(String nombre, String apellido) throws JugadorNoEncontrado
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


    @Override
    public String toString() {
        return 
        "\nnombre: " + nombre + 
        "\nparticipantes: " + participantes + 
        "\npuntos=" + puntos;
    }

}
