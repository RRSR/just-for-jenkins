package com.example.test;

import java.util.Stack;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan(basePackages = "com.example.test")
public class TestApplication extends SpringBootServletInitializer {


	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return super.configure(builder);
	}
*/
	@Value("${app.rabbitmq.url}")
	public static String url;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TestApplication.class, args);

		Hello obj = new Hello();
		obj.justPrint(url);
	}
}


	/*public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}


	@Value("${app.rabbitmq.url}")
	public String url;

	Hello obj = new Hello();
	obj
}*/
