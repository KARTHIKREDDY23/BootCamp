package com.cg.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2 //enabling the swagger2 for this spring boot application
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);//bootstrapping a spring application as a stand alone application from the main method
	}
	@Bean
	public RestTemplate getRestTemplate() //It offers templates for common scenarios by HTTP method
	{
		return new RestTemplate();
	}
	@Bean
    public Docket produceApi() // Docket Bean helps to configure Swagger2 for this spring Boot Application
    {
    	return new Docket(DocumentationType.SWAGGER_2).select().
    			apis(RequestHandlerSelectors.basePackage("com.cg.test")).build(); 
    }
}
