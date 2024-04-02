package com.udacity.vehicles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VehiclesApiApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void getPriceById() throws Exception {
        int vehicleId = 1;
        URI uri = new URI("/services/price?vehicleId=" + vehicleId);

    }
}
