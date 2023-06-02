package test;

import dubluri.StubPersoana;
import dubluri.StubPersoanaMajora;
import model.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PoateRezervaTest {

    @Test
    void poateRezerva() {
        StubPersoana stubPersoana=new StubPersoana();
        PachetTuristic pachetTuristic=new PachetTuristic(stubPersoana,"Bucuresti",20.3);
        assertFalse(pachetTuristic.poateRezerva());


    }

    @Test
    void poateRezervaPersoanaMajora() {

        StubPersoanaMajora stubPersoanaMajora=new StubPersoanaMajora();
        PachetTuristic pachetTuristic1=new PachetTuristic(stubPersoanaMajora,"Buzau",24.5);
        assertTrue(pachetTuristic1.poateRezerva());

    }


}