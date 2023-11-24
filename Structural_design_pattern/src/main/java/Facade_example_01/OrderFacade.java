package Facade_example_01;

public class OrderFacade {
    
    WaiterSubsystem1 waiter = new WaiterSubsystem1();
    KitchenSubsystem2 kitchen = new KitchenSubsystem2();

    public void orderFood(){
        waiter.writeOrder();
        waiter.sendTokitchen();
        kitchen.prepareFood();
        kitchen.callWaiter();
        waiter.serveCustomer();
        kitchen.washDishes();
    }
}
