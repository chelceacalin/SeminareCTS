package factoryMethod;


public class Asistent extends PersonalSpital {

    public Asistent(){
        super();
    }

    public  Asistent(String name){
        super(name);
    }
    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getName()+" este: " +this.getClass().getName()+" ");
    }
}
