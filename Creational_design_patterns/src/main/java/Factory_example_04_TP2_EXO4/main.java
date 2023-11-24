package Factory_example_04_TP2_EXO4;

abstract class Vehicle {
    int wheels;
    String engine;

    public abstract void displayInfo();
}


class Car extends Vehicle {
    int doors;

    public Car(int doors) {
        this.wheels = 4;
        this.engine = "Internal Combustion Engine";
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car with " + doors + " doors");
    }
}


class Motorcycle extends Vehicle {
    int cylinders;

    public Motorcycle(int cylinders) {
        this.wheels = 2;
        this.engine = "Internal Combustion Engine";
        this.cylinders = cylinders;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle with " + cylinders + " cylinders");
    }
}


class Bicycle extends Vehicle {
    public Bicycle() {
        this.wheels = 2;
        this.engine = "None";
    }

    @Override
    public void displayInfo() {
        System.out.println("Bicycle");
    }
}




interface VehicleFactory {
    Vehicle createVehicle();
}


 
class CarFactory implements VehicleFactory {
    private int doors;

    public CarFactory(int doors) {
        this.doors = doors;
    }

    @Override
    public Vehicle createVehicle() {
        return new Car(doors);
    }
}
 

class MotorcycleFactory implements VehicleFactory {
    private int cylinders;

    public MotorcycleFactory(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public Vehicle createVehicle() {
        return new Motorcycle(cylinders);
    }
}

 
class BicycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}





public class main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory(4);
        Vehicle car = carFactory.createVehicle();
        car.displayInfo();

        VehicleFactory motorcycleFactory = new MotorcycleFactory(2);
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.displayInfo();

        VehicleFactory bicycleFactory = new BicycleFactory();
        Vehicle bicycle = bicycleFactory.createVehicle();
        bicycle.displayInfo();
    }
}


