package clase;

public class Secretariat {
    private int numarBirouri;
    private int numarAngajati;
    private static Secretariat instanta=null;

    private Secretariat(int numarBirouri,int numarAngajat){
        this.numarBirouri=numarBirouri;
        this.numarAngajati=numarAngajat;
    }

    public synchronized static Secretariat getInstanta(int numarBirouri,int numarAngajati){
        if(Secretariat.instanta==null){
           Secretariat.instanta=new Secretariat(numarBirouri,numarAngajati);
        }
            return Secretariat.instanta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Secretariat{");
        sb.append("numarBirouri=").append(numarBirouri);
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
