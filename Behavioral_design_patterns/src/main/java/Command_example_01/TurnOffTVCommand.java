package Command_example_01;

public class TurnOffTVCommand implements Command{
    private TV tv;
    
    public TurnOffTVCommand(TV tv){
        this.tv = tv;
    }
    
    
    @Override
    public void execute() {
        this.tv.turnOff();
    }
    
    @Override
    public void undo() {
        this.tv.turnOn();
    }
}