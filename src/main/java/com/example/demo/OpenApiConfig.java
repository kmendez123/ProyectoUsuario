package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI usersMicroserviceOpenAPI() {
		return new OpenAPI().info(new Info().title("API CRUD Usuario").description("Karla Mendez")

				.version("1.0"));
	}

}
