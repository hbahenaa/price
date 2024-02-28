package org.play.shoporch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "org.play.shoporch.infrastructure.model.entity")
@SpringBootApplication
public class ShopOrchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopOrchApplication.class, args);
    }

}
