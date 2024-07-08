package uz.abdurahmon.socialgetaway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder locatorBuilder) {
        return locatorBuilder.routes()
                .route(r -> r.path("/api/auth/**").uri("lb://SocialUserService"))
                .build();
    }
}
