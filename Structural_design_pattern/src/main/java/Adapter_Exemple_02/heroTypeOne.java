package Adapter_Exemple_02;

public class heroTypeOne implements Ihero{
    @Override
    public void attack(){
        System.out.println("HeroType1 attack");
    }
    @Override
    public void run(){
        System.out.println("HeroType1 run");
    }
    @Override
    public void stop(){
        System.out.println("HeroType1 stop");
    }
}