package domain.estacion;

import domain.bicicleta.Movil;
import domain.targeta.Autenticacion;

public class Estacion{

    private final int id;
    private final String direction;
	private final Anclajes anchors;

    Estacion(int id, String direction, int numAnchors){
        this.id = id;
        this.direction = direction;
        this.anchors = new Anclajes[numAnchors];
    }

    private int getId(){
        return this.id;
    }

    private String getDirection(){
        return this.direction;
    }

    public String toString(){
        return "ID: " + Integer.toString(this.id) + '\n' + "Direction: " + this.getDirection() + '\n' + "Anchors number: " + Integer.toString(this.anchors.length);
    }

    private Anclaje[] anchors(){
        return this.anchors.anchors();
    }

    private int numAnchors(){

    }

    public void info(){

    }

    public int freeAnchors(){

    }

    public void anchorBike(Movil bike){

    }

    public boolean readUserCard(Autenticacion card){

    }

    public void getBike(Autenticacion card){

    }

    private void showBike(Movil bike, int pos){

    }

    private void showAnchor(Movil bike, int pos){

    }

    public void anchorInfo(){

    }

}