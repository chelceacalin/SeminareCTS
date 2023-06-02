package dubluri;


import model.IPersoana;

public class Fake implements IPersoana {

    private int getVarstaValue;
    private boolean checkCNPValue;
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return getVarstaValue;
    }

    @Override
    public boolean checkCNP() {
        return checkCNPValue;
    }

    public void setGetVarstaValue(int getVarstaValue) {
        this.getVarstaValue = getVarstaValue;
    }

    public void setCheckCNPValue(boolean checkCNPValue) {
        this.checkCNPValue = checkCNPValue;
    }
}