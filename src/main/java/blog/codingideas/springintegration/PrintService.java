package blog.codingideas.springintegration;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

public class PrintService {

    public Message print(Message<String> message) {
        System.out.println(message.getPayload());
        MessageHeaders headers = message.getHeaders();
        int messageNumber = (int) headers.get("messageNumber");
        return MessageBuilder.withPayload("New Sending a reply message for message number " + messageNumber).build();
    }
}
