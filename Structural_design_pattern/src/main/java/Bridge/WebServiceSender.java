package Bridge;

public class WebServiceSender implements IMessageSender{
    @Override
    public void SendMessage(String subject, String body){
        System.out.println("send using WebServiceSender");
        System.out.println("Subject: " + subject );
        System.out.println("Body: " + body );
    }
}
