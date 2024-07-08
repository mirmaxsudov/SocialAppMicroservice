package uz.abdurahmon.socialpostservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SocialPostServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialPostServiceApplication.class, args);
    }

}
