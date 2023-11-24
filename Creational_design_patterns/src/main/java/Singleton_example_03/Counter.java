package Singleton_example_03;

public class Counter {
    
    
    public int counter = 0;    // public counter to inc
    
    private Counter () {}    // to cannot create instance from other class
    
    /*
    
    Sol 1
    
    private static Counter instance = new Counter();    // this only one object , i create it and he is in RAM 
                                                        // without using from other classes, it is only one instance and located in RAM
                                                        // but this not opt, if no one needs it ? rah in RAM batel
    
    
    public static final Counter GetInstance () {      // final (fixed value)
        return instance;                              // return object that i create 
    }
    
    */
    
    //  Sol2 : Lazy Initialization : Postponing (t2jil) operation of Initialization until someone need it ! 
    
    private static Counter instance = null; 
    
     public static final Counter GetInstance () {      
        if (instance == null) {
            instance = new Counter();
        } 
        return instance;                             
    }
    
    public void Addone() {
        counter++;
    }
}
