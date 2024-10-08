package com.example.interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InterceptorApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(InterceptorApplication.class, args);

		// Get the ApiService bean from the context
		ApiService apiService = context.getBean(ApiService.class);

		// Call the ApiService method to invoke an external API and log the request/response
		String response = apiService.callExternalApi();

		// Print the API response
		System.out.println("API Response: " + response);
	}

}
