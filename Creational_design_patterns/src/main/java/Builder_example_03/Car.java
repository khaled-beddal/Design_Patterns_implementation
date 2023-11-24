package Builder_example_03;

public class Car {
    private String model;
    private String engine;
    private String color;
    
    public void setModel(String model) {
        this.model = model ;
    }
    
    public void setEngine(String engine){
        this.engine = engine;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Car [Model:" + model + ", Engine:" + engine + " , Color " + color ;
    }
    
}
