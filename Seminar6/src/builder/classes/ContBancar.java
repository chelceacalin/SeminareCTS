 package builder.classes;

public class ContBancar {
    private String numeClient;
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    protected ContBancar(String numeClient,boolean primesteSalariu,boolean cardAtasat,boolean internetBanking){
        this.numeClient=numeClient;
        this.primesteSalariu=primesteSalariu;
        this.cardAtasat=cardAtasat;
        this.internetBanking=internetBanking;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public boolean isPrimesteSalariu() {
        return primesteSalariu;
    }

    public void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }

    public boolean isCardAtasat() {
        return cardAtasat;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public boolean isInternetBanking() {
        return internetBanking;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", primesteSalariu=").append(primesteSalariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append('}');
        return sb.toString();
    }
}
