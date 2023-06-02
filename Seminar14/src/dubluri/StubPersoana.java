package dubluri;

import model.IPersoana;

public class StubPersoana implements IPersoana {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 16;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}