package se.eneroth.springdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Rickard on 2015-02-12.
 */
@Configuration
@ComponentScan(value={"se.eneroth.springdi"})
public class DIConfiguration {

    @Bean
    public MessageService getMessageService(){

        //TODO kan tex togglas via property fil

        //return new EmailService();
        return new TwitterService();
    }
}


