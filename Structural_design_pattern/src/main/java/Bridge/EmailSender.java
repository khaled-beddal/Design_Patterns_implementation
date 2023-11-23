package Bridge;

public class EmailSender implements IMessageSender{
    @Override
    public void SendMessage(String subject, String body){
        System.out.println("send using EmailSender");
        System.out.println("Subject: " + subject );
        System.out.println("Body: " + body );
    }
}
