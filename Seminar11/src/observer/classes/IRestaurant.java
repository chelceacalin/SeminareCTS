package observer.classes;

public interface IRestaurant {
    void abonareClient(IClient client);
    void dezabonareClient(IClient client);
    void notificareClient(String mesaj);
}
