package Singleton_example_04_TP2_EXO2;

public class InternetConnectionManager {

    public int counter = 0;

    private static InternetConnectionManager instance = null;

    
    private InternetConnectionManager() {}


    public static synchronized InternetConnectionManager getInstance() {
        if (instance == null) {
            instance = new InternetConnectionManager();
        }
        return instance;
    }



    public void connect() {
        counter++;
    }
    
    public void disconnect() {}
    
    
    
    
    
    // Real Example implementation : 
    
    public void connect2() {
        if (counter == 0) {     // you can use a boolean 
        counter++;
        System.out.print("Connected\n");
        } else {
        System.out.print("You have already Connected!\n");
        }
                
    }

    public void disconnect2() {
        if (counter == 1) {
        counter--;
        System.out.print("Disconnect\n");
        } else {
        System.out.print("You have already Disconnect!\n");
        }   
    }
    

    
}
