package app.messages;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("app.messages")

public class AppConfig {

    @Bean
    public MessageRepository messageRepository() {
        return new MessageRepository();
    }

    @Bean
    MessageService messageService() {
        return new MessageService(messageRepository());
    }
}
