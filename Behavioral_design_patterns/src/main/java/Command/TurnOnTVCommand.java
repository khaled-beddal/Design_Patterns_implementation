package Command;

public class TurnOnTVCommand implements Command{
    private TV tv;
    
    public TurnOnTVCommand(TV tv){
        this.tv = tv;
    }
    
    
    @Override
    public void execute() {
        this.tv.turnOn();
    }
    
    @Override
    public void undo() {
        this.tv.turnOff();
    }
}