package Singleton;

public class main {
    public static void main(String[] args) {
        
        // Single single1 = new Single();
        // single1.printdata();

        // Single single2 = new Single();
        // single2.printdata();

        Single single1 = Single.getInstance();
        single1.printdata();

        Single single2 = Single.getInstance();
        single2.printdata();

    }
}
