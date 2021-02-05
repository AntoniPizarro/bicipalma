package domain.estacion;

import domain.bicicleta.Movil;
public class Anclaje{

    private Boolean ocuped;
    private Movil bike;

    Anclaje() {};   //Copiado

    public Boolean isOcuped() {
        if(this.bike != null){
            this.ocuped = true;
        }else{
            this.ocuped = false;
        }
        return this.ocuped;
    }

    public Movil getBike(){
        if(isOcuped() == true){
            Movil toGet = this.bike;
            freeBike();
            return toGet;
        }else{
            return null;
        }
    }

    public void anchorBike(Movil toAnchor){
        if(isOcuped() == false){
            this.bike = toAnchor;
        }
    }

    public void freeBike(){
        if(isOcuped() == false){
            this.bike = null;
        }
    }

    public String toString(){
        return "Ocuped: " + Boolean.toString(isOcuped());
    }
}