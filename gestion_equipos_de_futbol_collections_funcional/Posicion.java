package gestion_equipos_de_futbol_collections_funcional;

public enum Posicion {
    
    PORTERO(2000, 3000),
    DEFENSA(2500, 3500),
    CENTROCAMPISTA(3500, 4000),
    DELANTERO(4000, 5000);

    private final int salarioMax;
    private final int salarioMin;

    Posicion(int salarioMin, int salarioMax){
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
    }

    public int getSalarioMax(){
        return salarioMax;
    }

    public int getSalarioMin(){
        return salarioMin;
    }

}
