package Junit;

import model.ExceptionNenascut;
import model.IPersoana;
import model.Persoana;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @Test
    void getVarstaTestRight(){
       IPersoana persoana=new Persoana("andrei","5010815152222");
       assertEquals(21,persoana.getVarsta());
    }

    @Test
    void getVarstaTestBoundaryNouNascut(){
        IPersoana persoana=new Persoana("Andrei","5230524123456");
        assertEquals(0,persoana.getVarsta());
    }

    @Test
    void getVarstaTestBoundaryLimitaInferioara(){
        IPersoana persoana=new Persoana("Andrei","5000101123456");
        assertEquals(23,persoana.getVarsta());
    }

    @Test
    void getVarstaTestBoundaryLimitaSuperioara(){
        IPersoana persoana=new Persoana("Andrei","5000101123456");
        assertEquals(23,persoana.getVarsta());
    }

    @Test
    void  getVarstaErrorCondition(){
        IPersoana persoana=new Persoana("Andrei","6231231123456");
      assertThrows(ExceptionNenascut.class, new Executable() {
          @Override
          public void execute() throws Throwable {
                persoana.getVarsta();
          }
      });
    }


     @Test
    void getVarstaPerformance(){
        IPersoana persoana=new Persoana("Andrei","6001231123456");
        assertTimeout(Duration.ofMillis(100), persoana::getVarsta);
     }

     @Test
    void cnpCaracterCorect(){
        Persoana persoana=new Persoana("Andrei","5010815152222");
        assertEquals(13,persoana.getCNP().length());
     }

     @Test
     void ordineDeVarstaPersoane(){
        Persoana p1=new Persoana("Maria","6001231123454");
        Persoana p2=new Persoana("Ana","2981231123456");
        assertTrue(p1.getVarsta()<p2.getVarsta());
     }

     @Test
    void getVarstaThrowExceptionCNPNULL(){
        Persoana p1=new Persoana("Maria",null);
        assertThrows(RuntimeException.class,p1::getVarsta);
     }

    @Test
    void getVarstaCardinalityL(){
        Persoana p1=new Persoana("Maria","5220515151212");
        assertEquals(1,p1.getVarsta());
    }

    @Test
    void getVarstaCrossCheck(){
        Persoana p1=new Persoana("Radu","1111111111111");
        p1.setNume("Andrei");
        p1.setCNP("2222222222222");
        Persoana p2=new Persoana("Andrei","2222222222222");
        assertTrue(p1.getVarsta()==p2.getVarsta()&&p1.getCNP().equals(p2.getCNP()));
    }



}