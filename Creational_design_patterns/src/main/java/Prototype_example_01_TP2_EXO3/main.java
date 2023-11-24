package Prototype_example_01_TP2_EXO3;

// client
public class main {
    
    public static void main(String[] args) {
        
        Sheep originalSheep = new Sheep();
        
            originalSheep.name  = "Dolly" ;
            originalSheep.color = "White" ;


        Sheep clonedSheep = (Sheep) originalSheep.clone();

        // edit the cloned sheep
        clonedSheep.setName("Molly");
        clonedSheep.setColor("Black");


        System.out.println("Original sheep: " + originalSheep.getName() + " " + originalSheep.getColor());
        System.out.println("Cloned sheep: " + clonedSheep.getName() + " " + clonedSheep.getColor());
    }
     
}