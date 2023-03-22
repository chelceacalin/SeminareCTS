package simpleFactory;

public abstract class PersonalSpital {
    private String name;

    public PersonalSpital(){
        this.name="";
    }

    public PersonalSpital(String name){
        this.name=name;
    }

    public abstract void afiseazaDescriere();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
