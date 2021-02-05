package domain.targeta;

import java.sql.Blob;

public class TargetaUsuario{
    
    private final String id;
    private boolean actived;

    public TargetaUsuario(String id, boolean actived){
        this.id = id;
        this.actived = actived;
    }

    @Override   //Copiado
    public boolean isActived(){
        return this.actived;
    }

    public void setActived(boolean state){
        this.actived = state;
    }

    @Override   //Copiado
    public String toString(){
        return "ID: " + this.id;    //Corregido
    }

}