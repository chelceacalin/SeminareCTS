package template.classes;

public class Masa extends IMasa{
    public Masa(int nr){ super(nr); }
    @Override
    protected void curataMasa() {
        System.out.println("S-a curatat masa "+super.getNr());
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Au fost asezate servetele la masa "+super.getNr());
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Au fost asezate tacamuri pe masa "+super.getNr());
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Au fost invitate persoane la masa "+super.getNr());
    }
}
