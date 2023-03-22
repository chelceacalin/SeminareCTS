package simpleFactory;

public class Anestezist extends PersonalSpital{

    private Integer aniVechime;
    public Anestezist(){
        super();
    }

    public  Anestezist(String name,Integer aniVechime){
        super(name);
        this.aniVechime=aniVechime;

    }
    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getName()+" este: " +this.getClass().getName()+" are:"+this.aniVechime);
    }

}
