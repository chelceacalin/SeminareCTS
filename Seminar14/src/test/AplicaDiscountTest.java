package test;

import dubluri.Fake;
import model.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplicaDiscountTest {

    @Test
    void nuSeAplicaDiscount()
    {
        Fake fake=new Fake();
        fake.setGetVarstaValue(7);
        PachetTuristic pachetTuristic=new PachetTuristic(fake,"Eforie",1000d);
        pachetTuristic.aplicaDiscountVarstnici(30);
        assertEquals(1000,pachetTuristic.getPret());
    }
    @Test
    void seAplicaDiscount()
    {
        Fake fake=new Fake();
        fake.setGetVarstaValue(89);
        PachetTuristic pachetTuristic=new PachetTuristic(fake,"Eforie",1000d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900,pachetTuristic.getPret());
    }


}