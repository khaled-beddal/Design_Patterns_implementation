package Factory_example_01;

public class main {
    

    public static void main(String[] args) {
        
        // Sandwich sandwichCheeseBurger  = SandwichFactory.createSandwich(1);
        // Sandwich sandwichChickenBurger = SandwichFactory.createSandwich(2);

        Sandwich sandwichCheeseBurger  = SandwichFactory.createSandwich(SandwichFactory.CHEESE_BURGER);
        sandwichCheeseBurger.prepare();
        
        Sandwich sandwichChickenBurger = SandwichFactory.createSandwich(SandwichFactory.CHICKEN_BURGER);
        sandwichChickenBurger.prepare();

    }
}
