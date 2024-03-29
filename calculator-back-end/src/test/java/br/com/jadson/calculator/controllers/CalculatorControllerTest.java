package br.com.jadson.calculator.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Integration tests
 */
@ExtendWith(MockitoExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CalculatorControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    /**
     * A simple integration test example
     */
    @Test
    void testSum(){
        ResponseEntity<String> response = restTemplate
                .exchange("/calculator/sum?a=15&b=20", HttpMethod.GET, null, String.class);

        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertEquals("35", response.getBody());
    }

    @Test
    void testSub(){
        ResponseEntity<String> response = restTemplate
                .exchange("/calculator/sub?a=15&b=5", HttpMethod.GET, null, String.class);

        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertEquals("10", response.getBody());
    }

}