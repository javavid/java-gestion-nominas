package eventosDeportivos;

public class EdadNoValidaExcepcion extends Exception{
    
    public EdadNoValidaExcepcion()
    {
        super("Edad NO validad, Debe Ser Mayor a 14 Años");
    }
}
