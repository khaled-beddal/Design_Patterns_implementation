package Adapter_Exemple_01;


// Client
public class Executor {
    public static void main(String[] args) {
        
        Vehicle car = new Car();
        useVehicle(car);

        Vehicle bike = new BicycleAdapter(new Bicycle());
        useVehicle(bike);

    }

    private static void useVehicle(Vehicle vehicle){
        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();
    }
}