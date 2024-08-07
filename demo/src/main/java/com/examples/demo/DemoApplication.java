package com.examples.demo;

import com.examples.demo.feign.OrgClient;
import com.examples.demo.model.Org;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	private final RestTemplate restTemplate = new RestTemplate();
	@Override
	public void run(String... args) throws Exception {
		restTemplate();
		//feignClientCall();

	}

	private void restTemplate()  {
		String url = "http://localhost:8081/api-v1/get";

		// Sending a GET request to the API and capturing the response
		ResponseEntity<List<Org>> response = restTemplate.exchange(
				url,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Org>>() {}
		);

		if (response.getStatusCode().is2xxSuccessful()) {
			List<Org> orgs = response.getBody();
			if (orgs != null) {
				for (Org org : orgs) {
					System.out.println("Org Name: " + org.getOrgName());
					System.out.println("Org Address: " + org.getId());
				}
			}
		} else {
			System.out.println("Request failed with status code: " + response.getStatusCode());
		}
	}


//	@Autowired
//	OrgClient orgClient;
//	private void feignClientCall()  {
//		ResponseEntity<List<Org>> response = orgClient.getOrgs();
//
//		if (response.getStatusCode().is2xxSuccessful()) {
//			List<Org> orgs = response.getBody();
//			if (orgs != null) {
//				for (Org org : orgs) {
//					System.out.println("Org Name: " + org.getOrgName());
//					System.out.println("Org Address: " + org.getId());
//				}
//			}
//		} else {
//			System.out.println("Request failed with status code: " + response.getStatusCode());
//		}
//	}

}
