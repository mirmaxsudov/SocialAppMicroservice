package uz.abdurahmon.socialsearchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SocialSearchServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialSearchServiceApplication.class, args);
    }

}
