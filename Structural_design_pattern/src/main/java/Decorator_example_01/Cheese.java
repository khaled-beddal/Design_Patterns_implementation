package Decorator_example_01;

public class Cheese extends SandwichDecorator{
    public Cheese (Sandwich sandwich){
        super(sandwich);
    }
    @Override 
    public double getCost(){
        return super.getCost() + 2;
    }
    @Override 
    public String getDescription(){
        return super.getDescription() + ", Cheese" ;
    }
}

