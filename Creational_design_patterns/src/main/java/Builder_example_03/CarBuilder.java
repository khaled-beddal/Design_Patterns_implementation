package Builder_example_03;

public interface CarBuilder {
   
    void setModel(String model);
    void setEngine(String engine);
    void setColor(String color);
    Car build();
    
}

