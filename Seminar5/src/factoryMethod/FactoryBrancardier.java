package factoryMethod;

public class FactoryBrancardier implements FactoryMethod{
    @Override
    public PersonalSpital createPersonal(String name) {
        return new Brancardier(name);
    }
}
