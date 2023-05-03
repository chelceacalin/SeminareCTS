package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements UnitateBancara{

    private String nume;
    private int nrAngajati;
    private List<UnitateBancara> filiale=new ArrayList<>();
    public Sucursala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }



    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
      filiale.add(unitateBancara);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        filiale.remove(unitateBancara);
    }
    @Override
    public void printDescriere(String indent) {
        System.out.println("Sucursala: "+ nume  + ", nrAngajati: " + nrAngajati);

        for(var elem:filiale){
           elem.printDescriere(indent);
        }
    }

    @Override
    public UnitateBancara getUnitate(int pozitie) {
        return filiale.get(pozitie);

    }
}
