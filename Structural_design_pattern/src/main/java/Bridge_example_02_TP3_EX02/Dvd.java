package Bridge_example_02_TP3_EX02;

public class Dvd implements Device{
    
    @Override
    public void Display(){
        System.out.println("Display Using Dvd");
    }
    @Override
    public void shutdown(){
       System.out.println("shutdown Using Dvd"); 
    }
    @Override
    public void volUp() {
        System.out.println("volUp Using Dvd");
    }
    @Override
    public void volDown(){
        System.out.println("volDown Using Dvd");
    }

}
