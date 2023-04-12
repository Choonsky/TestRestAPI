package com.nemirovsky.testrestapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(info =
@Info(title = "Test REST API Service", version = "0.1", description = "Test REST API Service v0.1")
)
public class TestRestApi {

    public static void main(String[] args) {
        try {
            SpringApplication.run(TestRestApi.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
