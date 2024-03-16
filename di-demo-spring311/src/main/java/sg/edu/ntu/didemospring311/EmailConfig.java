package sg.edu.ntu.didemospring311;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailConfig {
    @Bean
    EmailService emailService(){
        EmailService emailService = new EmailService();
        emailService.setReplyTo("avengers.com");
        return emailService;

        

    }
}
