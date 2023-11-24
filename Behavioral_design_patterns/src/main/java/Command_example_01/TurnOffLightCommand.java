package Command_example_01;

public class TurnOffLightCommand implements Command{
    private Light light;
    
    public TurnOffLightCommand(Light light){
        this.light = light;
    }
    
    
    @Override
    public void execute() {
        this.light.turnOff();
    }
    
    @Override
    public void undo() {
        this.light.turnOn();
    }
    
}