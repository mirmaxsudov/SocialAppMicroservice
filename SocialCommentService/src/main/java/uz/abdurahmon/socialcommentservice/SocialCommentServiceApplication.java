package uz.abdurahmon.socialcommentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SocialCommentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialCommentServiceApplication.class, args);
    }

}
