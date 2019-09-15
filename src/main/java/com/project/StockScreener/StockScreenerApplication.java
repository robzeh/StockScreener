package com.project.StockScreener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class StockScreenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockScreenerApplication.class, args);
	}

}
