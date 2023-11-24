package Singleton_example_03;

public class main {
    public static void main(String[] args) {
        
        // Counter object1 = new Counter();
        // Counter object2 = new Counter();
        
        Counter object1 = Counter.GetInstance();
        Counter object2 = Counter.GetInstance();
        
        object1.Addone();
        object2.Addone();
        
        
        
        System.out.println(object1.counter);
        System.out.println(object2.counter);
        
    }
}
