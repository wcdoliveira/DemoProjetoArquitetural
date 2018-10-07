package br.com.demoapp.apigateway.web.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.demoapp.apigateway.web.controller","br.com.demoapp.apigateway.web.model"})
public class DemoAppLojaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppLojaWebApplication.class, args);
	}
}
