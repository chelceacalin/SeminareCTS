package structurale.decorator.clase;

public class RezultatOnline extends DecoratorRezultat{
    public RezultatOnline(FurnizareRezultat furnizareRezultat) {
        super(furnizareRezultat);
    }

    @Override
    public void afisareOnline(String diagnostic) {
        System.out.println("Online "+diagnostic);
    }
}
