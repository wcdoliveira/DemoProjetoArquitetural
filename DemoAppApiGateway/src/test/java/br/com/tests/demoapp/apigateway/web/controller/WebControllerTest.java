package br.com.tests.demoapp.apigateway.web.controller;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.demoapp.apigateway.web.controller.WebController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=WebController.class)
public class WebControllerTest {	

    @Autowired
    private WebApplicationContext wac;  

	private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/templates/");
        viewResolver.setSuffix(".html");
    }

	@Test
	public void index() throws Exception {
		  this.mockMvc.perform(get("/index/")
				.accept(MediaType.parseMediaType("application/html;charset=UTF-8")))
		        .andExpect(status().isOk());
		  this.mockMvc.perform(get("/RANDOMNOTFOUND/")
				.accept(MediaType.parseMediaType("application/html;charset=UTF-8")))
		        .andExpect(status().isNotFound());		  
		  
	}
}