package Adapter_Exemple_02;


public class main {
    
    public static void play(Ihero ihero) {
        ihero.attack();
        ihero.run();
        ihero.stop();
        System.out.println("\n");
    }

    public static void main(String[] args) {  

        Ihero hero1 = new heroTypeOne();
        play(hero1);
        Ihero hero2 = new heroTypeTwo_Adaptor(new heroTypeTwo()); 
        play(hero2);
    }
    
}
