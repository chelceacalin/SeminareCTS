package flyweight.classes;

public class Detinator  implements IClientBanca{
    String nume;
    String nrtelefon;
    String adresa;

    public Detinator(String nume, String nrtelefon, String adresa) {
        this.nume = nume;
        this.nrtelefon = nrtelefon;
        this.adresa = adresa;
    }


    @Override
    public String toString() {
        return "Detinator{" +
                "nume='" + nume + '\'' +
                ", nrtelefon='" + nrtelefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    @Override
    public void descriere(Cont cont) {
        System.out.println(cont.toString());
    }
}
