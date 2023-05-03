package composite.main;

import composite.clase.Filiala;
import composite.clase.Sucursala;

public class main {
    public static void main(String[] args) {
        Sucursala s1=new Sucursala("Banca Transilvania",5);
        Sucursala s2=new Sucursala("BCR",10);

        Sucursala agentie1=new Sucursala("Agentia1",5);
        Sucursala agentie2=new Sucursala("Agentie,2",5);

        Filiala f1=new Filiala("F1",1);
        Filiala f2=new Filiala("F2",2);
        Filiala f3=new Filiala("F3",3);


        s1.adaugaUnitate(agentie1);
        agentie1.adaugaUnitate(f1);
        agentie1.adaugaUnitate(f2);

        s1.adaugaUnitate(agentie2);
        agentie2.adaugaUnitate(f2);
        agentie2.adaugaUnitate(f3);
        s1.printDescriere("   ");


        System.out.println("-----");
        agentie2.printDescriere("   ");
    }
}
