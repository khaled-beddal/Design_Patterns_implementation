package Decorator_example_01;

public class Executor {
    public static void main(String[] args) {
        Sandwich mySandwich1 = new BasicSandwich();
        System.out.println("> Your Sandwich contain: " + mySandwich1.getDescription());
        System.out.println("> With Price: " + mySandwich1.getCost());

        System.out.println("------------------------------------------");

        Sandwich mySandwich2 = new Beef(new BasicSandwich());
        System.out.println("> Your Sandwich contain: " + mySandwich2.getDescription());
        System.out.println("> With Price: " + mySandwich2.getCost());

        System.out.println("------------------------------------------");

        Sandwich mySandwich3 = new Cheese(new Beef(new BasicSandwich()));
        System.out.println("> Your Sandwich contain: " + mySandwich3.getDescription());
        System.out.println("> With Price: " + mySandwich3.getCost());
    }
}
