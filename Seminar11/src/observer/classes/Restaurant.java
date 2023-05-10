package observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String nume;
    List<IClient> clientList;

    public Restaurant(String nume){
        this.nume=nume;
        this.clientList=new ArrayList<>();
    }
    @Override
    public void abonareClient(IClient client) {
      clientList.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        clientList.remove(client);
    }

    @Override
    public void notificareClient(String mesaj) {
        for(var client:clientList){
            client.primesteNotificare(mesaj);
        }
    }


    public void introduceOfertaNoua(String mesaj){
        notificareClient(this.nume+" "+"a introdus o oferta noua");
    }

    public void adaugaDiscount(int discount){
        notificareClient(this.nume+"  a introdus in discount de "+discount);
    }
}
