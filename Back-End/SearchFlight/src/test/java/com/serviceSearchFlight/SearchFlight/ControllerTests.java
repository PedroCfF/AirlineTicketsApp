package com.serviceSearchFlight.SearchFlight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.serviceSearchFlight.SearchFlight.Models.FlightOrigin;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTests {
	
	private TestRestTemplate testRestTemplate;
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	@LocalServerPort
    private int port;
	
	@BeforeEach
    void setUp() {
        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:" + port);
        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
    }
	
	@Test
    void fetchOrigins() {
        ResponseEntity<FlightOrigin[]> response  =
                testRestTemplate.getForEntity("users", FlightOrigin[].class);
        
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}
