package factoryMethod;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        FactoryMedic factoryMedic=new FactoryMedic();
        FactoryBrancardier factoryBrancardier=new FactoryBrancardier();
        List<PersonalSpital> list=new ArrayList<>();
        list.add(factoryMedic.createPersonal("A"));

        for(var elem:list){
            elem.afiseazaDescriere();
        }
    }
}
