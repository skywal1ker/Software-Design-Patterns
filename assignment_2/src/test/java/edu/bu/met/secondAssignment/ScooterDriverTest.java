package edu.bu.met.secondAssignment;

import junit.framework.TestCase;

import java.time.LocalDate;

public class ScooterDriverTest extends TestCase {


    public void testTestUpdate() {
        DeliveryRequest request = new DeliveryRequest("123", "12 Main St", "John Doe", LocalDate.now());
        ScooterDriver driver = new ScooterDriver("Bob");
        driver.update(null, request);
        assertEquals("Bob", driver.name);
    }
}