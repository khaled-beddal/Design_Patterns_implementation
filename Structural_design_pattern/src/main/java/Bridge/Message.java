package Bridge;

public abstract class Message {
    String body;
    String Subject;
    IMessageSender MessageSender; 

    public void Send(){}
}
