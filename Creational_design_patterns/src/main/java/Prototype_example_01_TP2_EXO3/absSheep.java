package Prototype_example_01_TP2_EXO3;

// Prototype 
public abstract class absSheep {
    
    public String name;
    public String color;
    
    public absSheep() {}
    
    public absSheep(absSheep target){
        if (target != null) {
            this.name  = target.name;
            this.color = target.color;
        }
    }
    
    public abstract absSheep clone();

    
    
}
