package structurale.decorator.clase;

public abstract class DecoratorRezultat implements FurnizareRezultat {
   private  FurnizareRezultat furnizareRezultat ;

    public DecoratorRezultat(FurnizareRezultat furnizareRezultat) {
        this.furnizareRezultat = furnizareRezultat;
    }

    @Override
    public void printareRezultat(String diagnostic) {
        furnizareRezultat.printareRezultat(diagnostic);
    }

    public  abstract void afisareOnline(String diagnostic);
}
