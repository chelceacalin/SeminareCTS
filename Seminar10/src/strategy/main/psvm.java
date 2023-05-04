package strategy.main;

import strategy.classes.Operator;
import strategy.classes.verificaJuridica;
import strategy.classes.verificarePF;

public class psvm {
    public static void main(String[] args) {
        Operator operator=new Operator();
        operator.setModVerificare(new verificaJuridica());
        operator.verificaClient();
        operator.setModVerificare(new verificarePF());
        operator.verificaClient();
    }
}
