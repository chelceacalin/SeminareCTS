package factoryMethod;

public class FactoryMedic implements FactoryMethod{
    @Override
    public PersonalSpital createPersonal(String name) {
        return new Medic(name);
    }
}
