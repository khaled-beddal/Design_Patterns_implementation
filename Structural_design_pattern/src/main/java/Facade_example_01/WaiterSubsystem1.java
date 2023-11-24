package Facade_example_01;

public class WaiterSubsystem1 {
    

    public void writeOrder(){
        System.out.println("Take orders from clients!");
    }
    public void sendTokitchen(){
        System.out.println("Waiter send the order list to the kitchen!!");
    }
    public void serveCustomer(){
        System.out.println("Waiter serves the prepared food to the customer!");
    }
}
