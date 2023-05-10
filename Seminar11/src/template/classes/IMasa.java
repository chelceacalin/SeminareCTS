package template.classes;

public abstract class IMasa {
    int nr;
    public IMasa(int nr){
        this.nr=nr;
    }
    public int getNr(){ return this.nr; }

    protected abstract void curataMasa();
    protected abstract void aseazaServetele();
    protected abstract void aseazaTacamuri();
    protected abstract void invitaPersoane();

    public final void ocupaMasa(){
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaPersoane();
    }

}
