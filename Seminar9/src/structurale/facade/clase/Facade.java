package structurale.facade.clase;

import structurale.facade.main.Medic;

public class Facade {

    private Medic medic;
    private Salon salon;

    public Facade(){
        this.medic=new Medic();
        medic.adauga(new Pacient("Andrei",3));
        medic.adauga(new Pacient("Maria",5));
        medic.adauga(new Pacient("Nicolae",4));
        this.salon=new Salon();
        salon.addBed(1);
        salon.addBed(2);
      //  salon.addBed(3);
    }
    public void interneazaPacient(String nume){
        Pacient p=medic.getPacient(nume);
        if(medic.verificaTrimitere(p)){
            if(salon.verificaPaturiLibere()){
                if(p.getGravitate()>4){
                    System.out.println(p);
                    this.salon.ocupaPat();
                }
                else System.out.println("Gravitatea nu e destul de grava");
            }
            else System.out.println("Nu sunt sufiente paturi libere");
        }
        else System.out.println("Trimiterea nu este valida");
    }
}
