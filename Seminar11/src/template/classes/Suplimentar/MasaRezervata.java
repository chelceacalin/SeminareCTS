package template.classes.Suplimentar;

import template.classes.IMasa;

public class MasaRezervata extends IMasa {
    String nume;

    public MasaRezervata(String nume,int nr){
        super(nr);
        this.nume=nume;

    }
    @Override
    protected void curataMasa() {
        System.out.println("S-a curatat masa"+this.nume);
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Au fost asezate servetele la masa "+this.nume);
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Au fost asezate tacamuri pe masa "+this.nume);
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Au fost invitate persoane la masa "+this.nume);
    }
}
