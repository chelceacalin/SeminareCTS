package structurale.decorator.main;

import structurale.decorator.clase.DecoratorRezultat;
import structurale.decorator.clase.FurnizareRezultat;
import structurale.decorator.clase.RezultatOnline;
import structurale.decorator.clase.RezultatPeHartie;

public class main {
    public static void main(String[] args) {
        FurnizareRezultat furnizareRezultat=new RezultatPeHartie();
        furnizareRezultat.printareRezultat("Racela");

        DecoratorRezultat decoratorRezultat=new RezultatOnline(furnizareRezultat);
        decoratorRezultat.afisareOnline("Raceala");
    }
}
