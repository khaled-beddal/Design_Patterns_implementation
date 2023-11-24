package Prototype_example_01;

public class main {

    public static void main(String[] args) {
        
        Circle circle = new Circle();
            circle.x = 10;
            circle.y = 20;
            circle.color = "red";

        Rectangle rectangle = new Rectangle();
            rectangle.x = 10;
            rectangle.y = 20;
            rectangle.color = "blue";
        

            Shape circleCopy = circle.clone();
            Shape rectangleCopy = rectangle.clone();
        
        System.out.println(circleCopy.color);
        System.out.println(rectangleCopy.color);
    }

}
