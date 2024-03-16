package sg.edu.ntu.springboot311assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChannelConfig {

    @Bean
    Channel channelService(){
        Channel channelService  = new Channel();
        channelService.setType("SMS");
        return channelService;
    }

    
}
