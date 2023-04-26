package structurale.facade.main;

import structurale.facade.clase.Pacient;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    private List<Pacient> numePacienti;

    public Medic(){ numePacienti=new ArrayList<>(); }

    public void adauga(Pacient p){
        numePacienti.add(p);
    }
    public boolean verificaTrimitere(Pacient pacient){
        return this.numePacienti.contains(pacient);
    }

    public Pacient getPacient(String nume){
        for(Pacient p:this.numePacienti){
            if(p.getNume().equals(nume))
                return p;
        }
        return null;
    }

}
