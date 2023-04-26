package structurale.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> coduriPaturiLibere;

    public Salon(){
        this.coduriPaturiLibere=new ArrayList<>();
    }

    public void addBed(Integer codPat){
        coduriPaturiLibere.add(codPat);
    }
    public boolean verificaPaturiLibere(){
        return coduriPaturiLibere.size()>0;
    }

    public void ocupaPat(){
        this.coduriPaturiLibere.remove(0);
    }
}
