package com.TwoTempate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({"com.TwoTempate.*"})
@SpringBootApplication
public class TwoTempate extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TwoTempate.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(TwoTempate.class, args);
	}
 }
