package Builder_example_03;

public class SportCarbuilder implements CarBuilder {
    private Car car = new Car();

    public void setModel(String model) {
    car.setModel(model);
    }
    public void setEngine(String engine) {
    car.setEngine(engine);
    }
    public void setColor(String color) {
    car.setColor(color);
    }
    public Car build(){
    return car; }
    
}

