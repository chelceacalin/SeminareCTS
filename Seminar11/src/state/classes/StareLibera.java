package state.classes;

public class StareLibera implements IStare{
    @Override
    public void modificaStare(Masa masa) {

        if(!(masa.getStare() instanceof StareLibera) ){
            masa.setStare(this);
            System.out.println("Masa este libera acum ");
        }
        else {
            System.out.println("Masa este deja libera");
        }
    }
}
