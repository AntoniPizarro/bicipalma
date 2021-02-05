package domain.bicicleta;

import domain.bicicleta.Movil;

public class Bicicleta implements Movil{

    private final int id;

    Bicicleta(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String toString(){
        return "Bike ID: " + Integer.toString(getId());
    }
}