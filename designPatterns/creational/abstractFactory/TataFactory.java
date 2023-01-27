package designPatterns.creational.abstractFactory;

public class TataFactory  implements IFactory {

    @Override
    public Bike getBike() {
        // TODO Auto-generated method stub
        return new TataBike();
    }    

    @Override
    public Car getCar() {
        // TODO Auto-generated method stub
        return new TataCar();
    }
}
