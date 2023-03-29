package builder.classes;

public class ContBuilder implements  IBuilder{
    ContBancar contBancar;

    public ContBuilder() {
        this.contBancar=new ContBancar("Alex",false,false,false);
    }


    public void setContBancar(ContBancar contBancar) {
        this.contBancar = contBancar;
    }



    public ContBuilder setNumeClient(String numeClient) {
       this.contBancar.setNumeClient(numeClient);
       return this;
    }

    public ContBuilder setprimesteSalariu(boolean primesteSalariu){
        this.contBancar.setPrimesteSalariu(primesteSalariu);
        return this;
    }

    @Override
    public ContBancar build() {
        return new ContBancar(contBancar.getNumeClient(), contBancar.isPrimesteSalariu(),contBancar.isCardAtasat(), contBancar.isInternetBanking());
    }

    public ContBuilder setcardAtasat(boolean cardAtasat){
        this.contBancar.setCardAtasat(cardAtasat);
        return this;
    }
    public ContBuilder setinternetBanking(boolean internetBanking){
        this.contBancar.setInternetBanking(internetBanking);
        return this;
    }


}
