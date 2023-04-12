package com.nemirovsky.testrestapi;

import com.nemirovsky.testrestapi.controller.TestRestController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TestRestSmokeTest {

    @Autowired
    private TestRestController controller;

    @Test
    @DisplayName("Test REST API service smoke test: context load and controller init")
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }



}
