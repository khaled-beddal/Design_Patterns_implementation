package Builder_example_02_TP2_EXO1;

public class main {
   
            public static void main(String[] args) {
            
            /*
            Dog myDog = Dog.builder("Fido", "Golden Retriever", 5)
                          .AddToy("Ball")
                          .AddToy("Frisbee")
                          .build();
            
            System.out.println(dog1.getName());   
            System.out.println(dog1.getType());  
            System.out.println(dog1.getAge());    
            System.out.println(dog1.getToys());   
            
            */
            
            Dog dog1 = new Dog.Builder().Name("Max").Type("Labrador").Age(3).AddToy("Squeaky Bone").build();
            Dog dog2 = new Dog.Builder().Name("Bella").Type("Poodle").Age(2).AddToy("Plush Duck").AddToy("Rope Toy").build();
            
            System.out.println(dog1);   
            System.out.println(dog2);  
            

            
           
    }
    
}
