package Bridge;

public class MSMQSender implements IMessageSender {
    @Override
    public void SendMessage(String subject, String body){
        System.out.println("send using MSMQSender");
        System.out.println("Subject: " + subject );
        System.out.println("Body: " + body );
    }
}

