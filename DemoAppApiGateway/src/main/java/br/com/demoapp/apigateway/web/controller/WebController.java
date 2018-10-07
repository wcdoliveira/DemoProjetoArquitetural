package br.com.demoapp.apigateway.web.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {
	
	@Value("${path.backendapp}")
	private String pathBackendApp;
	
	@Value("${path.backendapp.crud.user}")
	private String pathBackendAppUser;
	
	@Value("${path.backendapp.crud.customer}")
	private String pathBackendaAppCustomer;
	
	@Value("${path.backendapp.crud.product}")
	private String pathBackendAppProduct;
	
	@Value("${path.backendapp.crud.order}")
	private String pathBackendAppOrder;
	
	@Value("${path.backendapp.crud.partner}")
	private String pathBackendAppPartner;
		
	@RequestMapping("/index")
    public String index() {
        return "index";
    }
	
	@RequestMapping("/user")
    public String transformToUser() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response  = restTemplate.getForEntity(pathBackendAppUser, String.class);
        return response.getBody();
    }
	
	@RequestMapping("/customer")
    public String transformToCustomer() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response  = restTemplate.getForEntity(pathBackendaAppCustomer, String.class);
        return response.getBody();
    }
	
	@RequestMapping("/product")
    public String transformToProduct() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response  = restTemplate.getForEntity(pathBackendAppProduct, String.class);
        return response.getBody();
    }
	
	@RequestMapping("/order")
    public String transformToOrder() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response  = restTemplate.getForEntity(pathBackendAppOrder, String.class);
        return response.getBody();
    }
	
	@RequestMapping("/partner")
    public String transformToPartner() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response  = restTemplate.getForEntity(pathBackendAppPartner, String.class);
        return response.getBody();
    }
}