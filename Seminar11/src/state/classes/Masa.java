package state.classes;

public class Masa {
    private int nr;
    private IStare stare;

    public Masa(int nr){
        this.nr = nr;
        stare=new StareLibera();
    }

    void setStare(IStare stare){
        this.stare=stare;
    }

    public IStare getStare(){
        return this.stare;
    }

    public int getNr(){
        return  this.nr;
    }


    public void ocupareMasa(){
        IStare stare=new StareOcupata();
        stare.modificaStare(this);
    }

    public void elibereazaMasa(){
        IStare stare=new StareLibera();
        stare.modificaStare(this);
    }
    public void rezervaMasa(){
        IStare stare=new StareRezervata();
        stare.modificaStare(this);
    }

    public void anuleazaRezervare(){
        IStare stare=new StareLibera();
        stare.modificaStare(this);
    }
}
