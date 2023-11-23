package Bridge;

public class SystemMessage extends Message{

    @Override 
    public void Send(){
        MessageSender.SendMessage(Subject, body);
    }

}