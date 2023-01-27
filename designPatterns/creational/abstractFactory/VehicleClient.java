package designPatterns.creational.abstractFactory;

public class VehicleClient {
    public static void main(String[] args) {
        
    IFactory f = FactoryProducer.getFactory("Hero");
     Car c = f.getCar();
     Bike b = f.getBike();
     c.buy();
     b.buy(); 
}
}
