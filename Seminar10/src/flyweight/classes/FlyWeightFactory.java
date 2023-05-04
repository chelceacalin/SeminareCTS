package flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    private Map<String,IClientBanca> mapCont;

    public FlyWeightFactory(){
        this.mapCont=new HashMap<>();
    }

    public IClientBanca getDetinator(String nume,String nrTelefon,String adresa){
        if(!mapCont.containsKey(nume)){
            mapCont.put(nume,new Detinator(nume,nrTelefon,adresa));
        }
        return mapCont.get(nume);
    }
}
