package Bridge_example_01;

public abstract class Message {
    String body;
    String Subject;
    IMessageSender MessageSender; 

    public void Send(){}
}
