package sistemaanalisisdetexto;


import java.util.List;
import java.util.Map;

public interface I_AnalizarPalabras {
    

    public List<String> PalabrasMasFrecuentes(int n);
    public List<String> PalabrasMenosFrecuentes(int n);
    public Map<Integer, List<String>> PalabrasPorLongitud();
}
