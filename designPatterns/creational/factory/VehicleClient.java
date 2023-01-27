package designPatterns.creational.factory;

public class VehicleClient {
    public static void main(String[] args) {
        
    Vehicle v = VehicleFactory.createVehicle("Bike1");
    v.start();
    
}
}
