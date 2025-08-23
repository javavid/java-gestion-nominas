package eventosDeportivos;

public class ApellidoNoValidoExcepcion extends Exception{
    
    public ApellidoNoValidoExcepcion()
    {
        super("Apellido No Valido");
    }

    public ApellidoNoValidoExcepcion(String message)
    {
        super("Apellido No Valido");
    }
}
