package Adapter_Exemple_02;

public class heroTypeTwo_Adaptor implements Ihero{
    
    heroTypeTwo herotypetwo;

    public heroTypeTwo_Adaptor (heroTypeTwo herotypetwo){
        this.herotypetwo = herotypetwo;
    }

    @Override
    public void attack(){
        herotypetwo.FireRockets();
    }
    @Override
    public void run(){
        herotypetwo.move();
    }
    @Override
    public void stop(){
        herotypetwo.Break();
    }
}
