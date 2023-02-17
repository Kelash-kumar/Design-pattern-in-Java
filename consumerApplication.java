
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableJms
public class consumerApplication {
    
    @Autowired
    private MessageReceiver receiver;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
    
    @Component
    public static class MessageReceiver {
        @JmsListener(destination = "test.queue")
        public void receiveMessage(String message) {
            System.out.println("Received message: " + message);
        }
    }
}
