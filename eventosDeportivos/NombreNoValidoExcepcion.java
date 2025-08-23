package eventosDeportivos;

public class NombreNoValidoExcepcion extends Exception {
    

    public NombreNoValidoExcepcion() {
        super("Nombre No Valido");
    }

    public NombreNoValidoExcepcion(String mensage) {
        super("Nombre No Valido");
    }
    

}
