package sg.edu.ntu.springboot311assignment;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

/*
    TODO:
    - Annotate this class with @Component
    - Inject the Channel and Message instance using @Autowired
*/

@Component
public class NotificationService {
    
    @Autowired
    private Channel channel;

    @Autowired
    private Message message;

    public void setup(String to, String msg){
        message.setTo(to);
        message.setMessage(msg);
    }
    

    

    public void send(){
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("To:");
        messageBuilder.append(this.message.getTo());
        messageBuilder.append("\nMessage:");
        messageBuilder.append(this.message.getMessage());
        messageBuilder.append("\nChannel:");
        messageBuilder.append(this.channel.getType());
    }
}
    

