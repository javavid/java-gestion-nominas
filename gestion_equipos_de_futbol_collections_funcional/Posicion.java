package gestion_equipos_de_futbol_collections_funcional;

public enum Posicion {
    
    PORTERO(2000, 3000),
    DEFENSA(2500, 3500),
    CENTROCAMPISTA(3500, 4000),
    DELANTERO(4000, 5000);

    private final int salarioMax;
    private final int salarioMin;

    Posicion(int salarioMax, int salarioMin){
        this.salarioMax = salarioMax;
        this.salarioMin = salarioMin;
    }

    public int getSalarioMax(){
        return salarioMax;
    }

    public int getSalarioMin(){
        return salarioMin;
    }


    // ejemplo de como hacer un set manual para cuando no sirva el automatico.
    /*public void setSalarioMax(int salarioMax){
        this.salarioMax = salarioMax;
    }*/
}
