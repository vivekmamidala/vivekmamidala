package designPatterns.creational.factory;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType){
        if(vehicleType == null) return null;
        switch(vehicleType) {
            case "Car" : return new Car();
            case "Bike" : return new Bike();
            default : return null;
        }
    }
}
