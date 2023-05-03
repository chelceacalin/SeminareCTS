package composite.clase;

public class Filiala implements UnitateBancara {
    private String nume;
    private int nrAngajati;

    public Filiala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void printDescriere(String indentare) {
        System.out.println(indentare+ "Filiala " + this.nume + " are: " + this.nrAngajati + " angajati");
    }
}
