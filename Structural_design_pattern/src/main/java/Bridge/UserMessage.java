package Bridge;

public class UserMessage extends Message{
    String UserComments ; 

    @Override 
    public void Send(){
        MessageSender.SendMessage(Subject, body);
    }
}
