package designPatterns.creational.factory;

import java.util.Calendar;

public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car started");
    }
    
}
