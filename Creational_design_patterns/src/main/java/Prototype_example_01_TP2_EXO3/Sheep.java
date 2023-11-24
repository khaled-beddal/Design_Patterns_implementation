package Prototype_example_01_TP2_EXO3;


// ConcretePrototype

public class Sheep extends absSheep {

    public Sheep(){}
    
    public Sheep(Sheep target) {
        super(target);
    }
   
    public absSheep clone(){
        return new Sheep(this);
    }
    
    
    public void setName(String name) {
        this.name = name;
    }

 
    public String getName() {
        return name;
    }

 
    public void setColor(String color) {
        this.color = color;
    }

 
    public String getColor() {
        return color;
    }
    
    
   

}
