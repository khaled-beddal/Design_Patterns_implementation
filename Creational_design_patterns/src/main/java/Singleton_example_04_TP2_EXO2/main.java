package Singleton_example_04_TP2_EXO2;

public class main {
   public static void main(String[] args) {
       
        InternetConnectionManager connectionManager1 = InternetConnectionManager.getInstance();
        InternetConnectionManager connectionManager2 = InternetConnectionManager.getInstance();

        // Both connectionManager1 and connectionManager2 will refer to the same instance
        // Therefore, calling methods on either of them will affect the same connection
        
        
        /*
        connectionManager1.connect();
        connectionManager2.connect();
        
        System.out.print(connectionManager1.counter);
        */
 
        
        
        // Real Example practice : 
        
        connectionManager1.connect2();
        connectionManager1.connect2();
        
        connectionManager2.disconnect2();
        connectionManager1.disconnect2();
        
    } 
}
