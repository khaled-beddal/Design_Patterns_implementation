package Bridge_example_02_TP3_EX02;

public class UniversalRemoteControl extends UniversalRemote{
    
    @Override
    public void turnOn(){
        device.Display();
    };
    @Override
    public void turnOff(){
        System.out.println("turnOff Device");
        device.shutdown();
    };
    @Override
    public void volUp(){
        device.volUp();
    };
    @Override
    public void volDown(){
        device.volDown();
    };
}
