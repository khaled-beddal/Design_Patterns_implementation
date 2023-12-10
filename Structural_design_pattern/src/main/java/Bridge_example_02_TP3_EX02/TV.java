package Bridge_example_02_TP3_EX02;

public class TV implements Device{

    @Override
    public void Display(){
        System.out.println("Display Using TV");
    }
    @Override
    public void shutdown(){
       System.out.println("shutdown Using TV"); 
    }
    @Override
    public void volUp() {
        System.out.println("volUp Using TV");
    }
    @Override
    public void volDown(){
        System.out.println("volDown Using TV");
    }
}
