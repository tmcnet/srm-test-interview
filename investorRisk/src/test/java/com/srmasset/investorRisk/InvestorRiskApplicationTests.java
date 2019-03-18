package com.srmasset.investorRisk;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvestorRiskApplicationTests {

	@Test
	public void contextLoads() {
		post();
	}
	
	private static void post()
	{
	    final String uri = "http://localhost:8080/client/add";
	     
	    RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    String params = "{\n" + 
	    		"\"name\":\"Thiago\",\n" + 
	    		"\"creditLimit\":10.000,\n" + 
	    		"\"risk\":\"A\",\n" + 
	    		"\"interestRate\":12\n" + 
	    		"}";
	    HttpEntity<String> entity = new HttpEntity<String>(params, headers);
	     
	    ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);
	     
	    System.out.println(result);
	}

}
