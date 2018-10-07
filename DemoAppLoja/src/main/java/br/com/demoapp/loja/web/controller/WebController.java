package br.com.demoapp.loja.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import br.com.demoapp.loja.web.model.Order;
import br.com.demoapp.loja.web.model.Partner;
import br.com.demoapp.loja.web.model.Product;

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
	
	@RequestMapping("/orders")
    public String getOrders(Model model) {
	    RestTemplate restTemplate = new RestTemplate();
	    try {
		    ResponseEntity<List<Order>> response = restTemplate.exchange(
		    		pathGatewayOrder, HttpMethod.GET, null, new ParameterizedTypeReference<List<Order>>() {}
		    );
		    List<Order> result = response.getBody();  
		    if(result.size() > 0) {
			    model.addAttribute("orders", result);		    	
		    }else {
				model.addAttribute("message", "Nenhum registro encontrado. Tente novamente.");
		    }
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "Falha ao buscar registros. Tente novamente.");
		}
        return "orders";
    }
	
	@RequestMapping("/products")
    public String getProducts(Model model) {
	    RestTemplate restTemplate = new RestTemplate();
	    try {
		    ResponseEntity<List<Product>> response = restTemplate.exchange(
		    		pathGatewayProduct, HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {}
		    );
		    List<Product> result = response.getBody();  
		    if(result.size() > 0) {
			    model.addAttribute("products", result);		    	
		    }else {
				model.addAttribute("message", "Nenhum registro encontrado. Tente novamente.");
		    }
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "Falha ao buscar registros. Tente novamente.");
		}
        return "products";
    }
	
	@RequestMapping("/partners")
    public String getPartners(Model model) {
	    RestTemplate restTemplate = new RestTemplate();
	    try {
		    ResponseEntity<List<Partner>> response = restTemplate.exchange(
		    		pathGatewayProduct, HttpMethod.GET, null, new ParameterizedTypeReference<List<Partner>>() {}
		    );
		    List<Partner> result = response.getBody();  
		    if(result.size() > 0) {
			    model.addAttribute("partners", result);		    	
		    }else {
				model.addAttribute("message", "Nenhum registro encontrado. Tente novamente.");
		    }
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "Falha ao buscar registros. Tente novamente.");
		}
        return "partners";
    }
}