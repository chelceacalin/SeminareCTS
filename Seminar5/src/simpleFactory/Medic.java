package simpleFactory;


public class Medic extends PersonalSpital{

    public Medic(){
        super();
    }

    public  Medic(String name){
        super(name);
    }
    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getName()+" este: " +this.getClass().getName()+" ");
    }
}
