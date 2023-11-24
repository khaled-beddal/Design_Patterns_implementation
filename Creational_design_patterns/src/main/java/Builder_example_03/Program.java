package Builder_example_03;

public class Program {
    
    public static void main (String [] args) {
        
        CarBuilder builder = new SportCarbuilder();
        CarManufactur manufactur = new CarManufactur();
        Car sportCar = manufactur.construct(builder);
        
        
        System.out.println("Car create : " + sportCar);
        
    }
    
}
