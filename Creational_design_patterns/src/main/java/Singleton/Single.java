package Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Single {
    
    private Integer[] numbers = {1,2,3,4,5,6};
    private List<Integer> list = Arrays.asList(numbers);

    private static Single instance;
    // static to call without create object 
    public static Single getInstance(){
        if (instance == null) { instance = new Single(); } 
        return instance;
    }

    private Single() {
        System.out.println("Object created!");
        Collections.shuffle(list);
        System.out.println(this.hashCode());

    }

    public void printdata(){
        for (Integer i : list){
            System.out.print(i.toString() + " ");
        }
        System.out.println();
    }

}
