package Builder_example_02_TP2_EXO1;

import java.util.List;
import java.util.ArrayList;

public class Dog {
    
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;
    
    
    private Dog(String name, String type, Integer age, List<String> toys){
        this.name = name;
        this.type = type;
        this.age  = age;
        this.toys = toys;
    }
    
    
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getToys() {
        return toys;
    }
    
    @Override 
    public String toString(){
        return "Dog info:     " + "name: " + name + " | type: " + type + " | age: " + age + " | toys: " + toys;
    }
    
    public static class Builder {
            private String name;
            private String type;
            private Integer age;
            private List<String> toys = new ArrayList<>();         
            
            /*
            public Builder(String name, String type, Integer age) {
                this.name = name;
                this.type = type;
                this.age = age;
            }
            */
            public Builder Name(String name) {
                this.name = name;
                return this;
            } 
            
            public Builder Type(String type) {
                this.type = type;
                return this;
            }
            
            public Builder Age(Integer age) {
                this.age = age;
                return this;
            }
            
            public Builder AddToy(String toy) {
                this.toys.add(toy);
                return this;
            }       
            
            public Dog build() {
                return new Dog(this.name, this.type, this.age, this.toys);
            }
    }
    
    /*
        public static Builder builder(String name, String type, Integer age) {
            return new Builder(name, type, age);
        }
    */
    
}
