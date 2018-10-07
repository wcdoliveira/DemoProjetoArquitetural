package br.com.demoapp.apigateway.web.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	@Value("${path.gateway}")
	private String pathGateway;
	
	@Value("${path.gateway.crud.user}")
	private String pathGatewayUser;
	
	@Value("${path.gateway.crud.customer}")
	private String pathGatewayCustomer;
	
	@Value("${path.gateway.crud.product}")
	private String pathGatewayProduct;
	
	@Value("${path.gateway.crud.order}")
	private String pathGatewayOrder;
	
	@Value("${path.gateway.crud.partner}")
	private String pathGatewayPartner;
		
	@RequestMapping("/index")
    public String index() {
        return "index";
    }
}