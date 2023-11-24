package Builder_example_03;

public class CarManufactur {
    
    public Car construct (CarBuilder builder) {
        builder.setModel("Sports Car");
        builder.setEngine("V8");
        builder.setColor("Red");
        return builder.build();
    }
    
}
