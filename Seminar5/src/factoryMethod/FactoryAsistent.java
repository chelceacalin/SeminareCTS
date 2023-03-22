package factoryMethod;

public class FactoryAsistent implements FactoryMethod{
    @Override
    public PersonalSpital createPersonal(String name) {
        return new Asistent(name);
    }
}
