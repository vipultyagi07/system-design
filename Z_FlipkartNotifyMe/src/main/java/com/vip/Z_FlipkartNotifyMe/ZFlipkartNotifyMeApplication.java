package com.vip.Z_FlipkartNotifyMe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.vip.Z_FlipkartNotifyMe.model"})
public class ZFlipkartNotifyMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZFlipkartNotifyMeApplication.class, args);
	}

}
