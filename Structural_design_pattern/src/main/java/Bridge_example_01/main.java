package Bridge_example_01;

public class main {

    public static void main(String[] args) {
            
            IMessageSender email = new EmailSender();
            IMessageSender webservice = new WebServiceSender();
            IMessageSender msmq = new MSMQSender();

            Message systemMessage = new SystemMessage();
            Message userMessage   = new UserMessage();

            systemMessage.Subject = "Subject from SystemMessage";
            systemMessage.body = "Body from SystemMessage";
            systemMessage.MessageSender = email;
            systemMessage.Send();
            System.out.println("----------------------------------\n");
            systemMessage.MessageSender = webservice;
            systemMessage.Send();
            System.out.println("----------------------------------\n");
            systemMessage.MessageSender = msmq;
            systemMessage.Send();

            System.out.println("----------------------------------\n");
            System.out.println("----------------------------------\n");
            userMessage.Subject = "Subject from UserMessage";
            userMessage.body = "Body from UserMessage";
            userMessage.MessageSender = email;
            userMessage.Send();
            System.out.println("----------------------------------\n");
            userMessage.MessageSender = webservice;
            userMessage.Send();
            System.out.println("----------------------------------\n");
            userMessage.MessageSender = msmq;
            userMessage.Send();



    }

}
