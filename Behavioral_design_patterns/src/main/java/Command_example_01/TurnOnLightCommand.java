package Command_example_01;

public class TurnOnLightCommand implements Command{
    private Light light;
    
    public TurnOnLightCommand(Light light){
        this.light = light;
    }
    
    
    @Override
    public void execute() {
        this.light.turnOn();
    }
    
    @Override
    public void undo() {
        this.light.turnOff();
    }
    
}