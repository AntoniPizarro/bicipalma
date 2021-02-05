package domain.estacion;

import java.util.concurrent.ThreadLocalRandom;
import domain.estacion.Movil;

public class Anclajes{

    private Anclaje[] anchors;

    Anclajes(int numAnchors){
        this.anchors = new Anclaje[numAnchors];
        createAnchors();
    }

    private void createAnchors(){
        for(i = 0; i < anchors.length; i++){
            anchors[i] = new Anclaje();
        }
    }

    Anclaje[] anchors(){
        return this.anchors;
    }

    int numAnchors(){
        return this.anchors.length;
    }

    void occupyAnchor(int pos, Movil bike){
        this.anchors[pos].anchorBike(bike);
    }

    Boolean isAnchorOcuped(int pos){
        return this.anchors[pos].isOcuped();
    }

    void freeAnchor(int pos){
        if(isAnchorOcuped(pos) == true){
            this.anchors[pos].freeBike();
        }
    }

    Movil getBikeAt(int pos){
        if(isAnchorOcuped(pos) == true){
            Movil bike = this.anchors[pos].getBike();
            freeAnchor(pos);
            return bike;
        }
    }

    int chooseAnchor(){
        Integer pos = ThreadLocalRandom.current().nextInt(0, numAnchors());
        return pos;
    }

    @Override
    public String toString(){
        return "Anchor count: " + Integer.toString(numAnchors());
    }

}