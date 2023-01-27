package designPatterns.creational.abstractFactory;

import designPatterns.creational.factory.Vehicle;

public interface IFactory {
    Bike getBike();
    Car getCar();

}
