package com.soccer;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SoccerApplication extends SpringBootServletInitializer {
	
	@PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    }

	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplicationBuilder()
	            .sources(SoccerApplication.class)
	            .listeners(new ApplicationPidFileWriter("./application.pid"))
	            .build();
	    application.run(args);
		
	}

}
