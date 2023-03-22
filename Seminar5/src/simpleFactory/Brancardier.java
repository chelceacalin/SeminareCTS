package simpleFactory;

public class Brancardier extends PersonalSpital{

    public Brancardier(){
        super();
    }
    public  Brancardier(String name){
        super(name);
    }
    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getName()+" este: " +this.getClass().getName()+" ");
    }
}
