package state.classes;

public class StareOcupata implements IStare{


    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof StareOcupata)){
            masa.setStare(this);
            System.out.println("Masa s-a ocupat acum ");
        }
        else
        {
            System.out.println("Masa e deja ocupata ");
        }
    }
}
