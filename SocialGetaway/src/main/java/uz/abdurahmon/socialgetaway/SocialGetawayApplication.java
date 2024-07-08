package uz.abdurahmon.socialgetaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SocialGetawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialGetawayApplication.class, args);
    }

}
