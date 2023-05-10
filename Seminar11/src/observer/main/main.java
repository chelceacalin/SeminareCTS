package observer.main;

import observer.classes.Client;
import observer.classes.Restaurant;

public class main {
    public static void main(String[] args) {
        Client c1=new Client("Client 1");
        Client c2=new Client("Client 2");
        Client c3=new Client("Client 3");

        Restaurant restaurant=new Restaurant("Toscany");
        restaurant.abonareClient(c1);
        restaurant.abonareClient(c2);
        restaurant.abonareClient(c3);
        restaurant.adaugaDiscount(5);
        System.out.println();

       restaurant.dezabonareClient(c1);
       restaurant.introduceOfertaNoua("Oferta Noua");





    }
}
