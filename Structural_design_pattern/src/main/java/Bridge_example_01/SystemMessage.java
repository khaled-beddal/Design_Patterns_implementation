package Bridge_example_01;

public class SystemMessage extends Message{

    @Override 
    public void Send(){
        MessageSender.SendMessage(Subject, body);
    }

}