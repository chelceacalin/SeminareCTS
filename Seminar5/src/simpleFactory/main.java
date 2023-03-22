package simpleFactory;

import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        SimpleFactory factory=new SimpleFactory();
        PersonalSpital p1= factory.createPersonal(TipPersonal.Medic,"Alex");
       // p1.afiseazaDescriere();

        PersonalSpital p2=factory.createPersonal(TipPersonal.Anestezist,"Anes",5);
        //p2.afiseazaDescriere();

        List<PersonalSpital> list=new LinkedList<>();
        list.add(p1);
        list.add(p2);

        list.stream().forEach(elem->elem.afiseazaDescriere());
    }
}
