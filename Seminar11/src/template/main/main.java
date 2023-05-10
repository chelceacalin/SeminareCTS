package template.main;

import template.classes.IMasa;
import template.classes.Masa;
import template.classes.Suplimentar.MasaRezervata;

public class main {
    public static void main(String[] args) {

        IMasa masa=new Masa(1);
        masa.ocupaMasa();

        System.out.println();
        IMasa masa2=new MasaRezervata("Masa Rezervata",1);
        masa2.ocupaMasa();
    }
}
