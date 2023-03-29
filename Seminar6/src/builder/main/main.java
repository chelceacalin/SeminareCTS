package builder.main;

import builder.classes.ContBancar;
import builder.classes.ContBuilder;
import builder.classes.IBuilder;

public class main {

    public static void main(String[] args) {
        IBuilder builder=new ContBuilder();
        builder.setcardAtasat(true).setNumeClient("Calin");
        ContBancar b1=  builder.build();

        ContBancar contBancar2=  builder.setNumeClient("rares").build();
        System.out.println(contBancar2.toString());
        System.out.println(b1.toString());



    }

}
