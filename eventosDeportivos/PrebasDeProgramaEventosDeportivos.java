package eventosDeportivos;

import java.time.LocalDate;



public class PrebasDeProgramaEventosDeportivos {
    
    public static void main(String[] args) {

        

        

        Carrera carrera = new Carrera("vuelta de san juan", LocalDate.of(2025, 6, 22), "san juan", 56);
        
        try {
            Participantes p1 = new ParticipantesCarrera("sofia", "pinzon", 20, 13);
            Participantes p2 = new ParticipantesCarrera("loren", "edwars", 15, 15);
            Participantes p3 = new ParticipantesCarrera("pedro", "simpson", 18, 18);
            Participantes p4 = new ParticipantesCarrera("matiu", "pino", 17, 19);
            Participantes p5 = new ParticipantesCarrera("silfi", "greyras", 16, 15);

            carrera.inscribirParticipante(p1);
            carrera.inscribirParticipante(p2);
            carrera.inscribirParticipante(p3);
            carrera.inscribirParticipante(p4);
            carrera.inscribirParticipante(p5);

            System.out.println(carrera.obtenerGanador());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        for (ParticipantesCarrera pc : carrera.getParticipantesCarrera()) {
            System.out.println(" ");
            System.out.println(pc);
        }
        
        

        TorneoDeFutbol torneoDeFutbol = new TorneoDeFutbol("ligaMaster", LocalDate.of(2025, 9, 18), "colombia");
        

        try {
            
            Participantes p6 = new Equipos("Gio", "Moreno", 38, "Atletico Ncional", 42);
            Participantes p7 = new Equipos("Boca", "Negra", 33, "America De Cali", 36);
            Participantes p8 = new Equipos("Daniel", "Torres", 37, "Santa Fe", 33);
            Participantes p9 = new Equipos("Dayro", "Moreno", 36, "Once Caldas", 38);
            Participantes p10 = new Equipos("Bladimir", "Marin", 32, "Atletico Junior", 25);

            torneoDeFutbol.inscribirParticipante(p6);
            torneoDeFutbol.inscribirParticipante(p7);
            torneoDeFutbol.inscribirParticipante(p8);
            torneoDeFutbol.inscribirParticipante(p9);
            torneoDeFutbol.inscribirParticipante(p10);

            System.out.println(torneoDeFutbol.obtenerGanador());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        

        for (Equipos ef : torneoDeFutbol.getEquipos()) {
            System.out.println(" ");
            System.out.println(ef);
        }

    }
}
