package SingletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {
    private String denumire;
    private int nrAngajati;
    private static Map<String,InstitutiePublica> registruInstitutii=new HashMap<>();


    private InstitutiePublica(String denumire,int nrAngajati){
        this.denumire=denumire;
        this.nrAngajati=nrAngajati;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public static void setRegistruInstitutii(Map<String, InstitutiePublica> registruInstitutii) {
        InstitutiePublica.registruInstitutii = registruInstitutii;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InstitutiePublica{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }

    public static InstitutiePublica getInstitutie(String denumire){
        if(!registruInstitutii.containsKey(denumire)){
            registruInstitutii.put(denumire,new InstitutiePublica(denumire,0));
        }
        return registruInstitutii.get(denumire);
    }

}
