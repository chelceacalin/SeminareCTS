package observer.classes;

public class Client implements IClient{
    String nume;

    public Client(String nume){
        this.nume=nume;
    }
    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume+" ai primit mesajul: " +mesaj);
    }
}
