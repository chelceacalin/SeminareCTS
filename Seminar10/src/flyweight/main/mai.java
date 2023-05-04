package flyweight.main;

import flyweight.classes.Cont;
import flyweight.classes.FlyWeightFactory;
import flyweight.classes.IClientBanca;

public class mai {
    public static void main(String[] args) {
        FlyWeightFactory factory=new FlyWeightFactory();
        Cont con1=new Cont(1,5f);
        Cont cont2=new Cont(2,400f);


        IClientBanca detinator= factory.getDetinator("Ion","066666","Buc");
        IClientBanca detinator2= factory.getDetinator("Alin","0798","Buc");
        IClientBanca detinator3= factory.getDetinator("Ion","066666","Buc");

    }
}
