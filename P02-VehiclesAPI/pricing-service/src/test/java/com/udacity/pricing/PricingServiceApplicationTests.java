package com.udacity.pricing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.net.URI;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest()
public class PricingServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void contextLoad() throws Exception {
		given()
				.mockMvc(mockMvc)
				.when()
				.get(new URI("/services/price?vehicleId=1"))
				.then()
				.statusCode(HttpStatus.OK.value())
				.body("price", notNullValue())
				.body("currency", notNullValue())
				.body("vehicleId", notNullValue());
	}
}
