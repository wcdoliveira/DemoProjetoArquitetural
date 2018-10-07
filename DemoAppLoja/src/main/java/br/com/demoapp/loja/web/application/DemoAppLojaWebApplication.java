package br.com.demoapp.loja.web.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.demoapp.loja.web.controller","br.com.demoapp.loja.web.model"})
public class DemoAppLojaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppLojaWebApplication.class, args);
	}
}
