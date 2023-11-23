package Adapter_Exemple_01;

public class Car implements Vehicle{
    @Override
    public void accelerate(){
        System.out.println("Car starts moving");
    }
    @Override
    public void pushBreak(){
        System.out.println("Car stopped");
    }
    @Override
    public void soundHorn(){
        System.out.println("Beeb Beeb...");
    }
}