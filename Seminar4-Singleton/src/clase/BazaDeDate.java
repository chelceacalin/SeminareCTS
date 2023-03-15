package clase;

public class BazaDeDate {
    private int numarTabele;
    private int dimensiuneDate;
    public static BazaDeDate instanta=new BazaDeDate(5,10);

    private BazaDeDate(){};

    private BazaDeDate(int numarTabele,int dimensiuneDate){
        this.numarTabele=numarTabele;
        this.dimensiuneDate=dimensiuneDate;
    }

    public static BazaDeDate getInstanta(){
        return instanta;
    }


    public void setNumarTabele(int numarTabele) {
        this.numarTabele = numarTabele;
    }

    public void setDimensiuneDate(int dimensiuneDate) {
        this.dimensiuneDate = dimensiuneDate;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BazaDeDate{");
        sb.append("numarTabele=").append(numarTabele);
        sb.append(", dimensiuneDate=").append(dimensiuneDate);
        sb.append('}');
        return sb.toString();
    }
}
