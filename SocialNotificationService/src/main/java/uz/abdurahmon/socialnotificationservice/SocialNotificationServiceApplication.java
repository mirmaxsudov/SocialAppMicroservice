package uz.abdurahmon.socialnotificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SocialNotificationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SocialNotificationServiceApplication.class, args);
    }
}