package Command;

public class Client {

    public static void main(String[] args){
        
        RemoteControl remoteControl = new RemoteControl() ;
        
        Light light = new Light();
        TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(light);
        TurnOffLightCommand turnOffLightCommand = new TurnOffLightCommand(light);
        
        TV tv = new TV();
        TurnOnTVCommand turnOnTVCommand = new TurnOnTVCommand(tv);
        TurnOffTVCommand turnOffTVCommand = new TurnOffTVCommand(tv);
        
        
        remoteControl.addCommand(0, turnOnLightCommand, turnOffLightCommand);
        remoteControl.addCommand(1, turnOnTVCommand, turnOffTVCommand);
        
        
        System.out.println(remoteControl);
        
        remoteControl.onbuttonPressed(0);
        remoteControl.onbuttonPressed(1);
        
        remoteControl.offbuttonPressed(0);
        remoteControl.offbuttonPressed(1);
    
    
        System.out.print("\n\n");
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        
        
    
        // display nothing
        remoteControl.offbuttonPressed(2);
    
    }
    
}