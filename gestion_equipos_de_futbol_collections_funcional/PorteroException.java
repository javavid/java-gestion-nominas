package gestion_equipos_de_futbol_collections_funcional;

public class PorteroException extends Exception{
    
    public PorteroException()
    {
        super("Cantidad de porteros agregados no valido");
    }
}
