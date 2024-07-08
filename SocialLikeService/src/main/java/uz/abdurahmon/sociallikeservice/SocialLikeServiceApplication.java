package uz.abdurahmon.sociallikeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SocialLikeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialLikeServiceApplication.class, args);
    }

}
