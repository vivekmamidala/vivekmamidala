package designPatterns.creational.abstractFactory;

public class FactoryProducer {
    public static IFactory getFactory(String companyName) {
        if(companyName == null) return null;
        switch(companyName) {
            case "Tata" : return new TataFactory();
            case "Hero" : return new HeroFactory();
            default : return new TataFactory();
        }
    }
}
