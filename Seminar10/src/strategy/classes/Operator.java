package strategy.classes;

public class Operator {
    public  ModVerificare modVerificare;

    public void setModVerificare(ModVerificare mod){
        this.modVerificare=mod;
    }

    public void verificaClient(){
        modVerificare.verifica();
    }


}
