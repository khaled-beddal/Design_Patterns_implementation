package Bridge_example_01;

public class UserMessage extends Message{
    String UserComments ; 

    @Override 
    public void Send(){
        MessageSender.SendMessage(Subject, body);
    }
}
