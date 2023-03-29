package builder.classes;

public interface IBuilder {
    ContBancar build();

    ContBuilder setcardAtasat(boolean cardAtasat);
    ContBuilder setinternetBanking(boolean internetBanking);

    ContBuilder setNumeClient(String numeClient);
    ContBuilder setprimesteSalariu(boolean primesteSalariu);
}
