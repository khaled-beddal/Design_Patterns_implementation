package Command;

import java.util.LinkedList;


// Invoker
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    
    private LinkedList<Command> history ;
    
    public RemoteControl() {
        onCommands    = new Command[3];
        offCommands   = new Command[3];
        
        NoCommand noCommand = new NoCommand();
        for (int i = 0 ; i < onCommands.length ; i++){
            onCommands[i]  = noCommand;
            offCommands[i] = noCommand;  
        }
        
        history = new LinkedList<>();
        
    }
    
    public void addCommand (int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onbuttonPressed(int slot){
        onCommands[slot].execute();
        history.push(onCommands[slot]);
    }
    
    public void offbuttonPressed(int slot){
        offCommands[slot].execute();
        history.push(offCommands[slot]);
    }
    
    
    
    public void undoButtonPressed(){
        if (history.peek() != null) {
            history.poll().undo();
        } 
        else {
            System.out.println("No more history");
        }
    }
    
    
    
    // for System.out.println(remoteControl); => 
    @Override 
    public String toString (){
           StringBuffer buffer = new StringBuffer();
           for(int i = 0 ; i < onCommands.length; i++) {
                buffer.append(String.format("[Slot %d] %s \t %s%n", i, onCommands[i].getClass().getSimpleName(), offCommands[i].getClass().getSimpleName()));
           }
           
           return buffer.toString();
    }
    
}