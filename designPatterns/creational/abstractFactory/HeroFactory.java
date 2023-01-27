package designPatterns.creational.abstractFactory;

public class HeroFactory implements IFactory{


    @Override
    public Bike getBike() {
        // TODO Auto-generated method stub
        return new HeroBike();
    }

    @Override
    public Car getCar() {
        // TODO Auto-generated method stub
        return new HeroCar();
    }
}
