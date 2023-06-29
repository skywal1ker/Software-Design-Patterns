package edu.bu.met.homework6;

import junit.framework.TestCase;

import java.time.LocalDate;

public class TaxiDriverTest extends TestCase {

    public void testTestUpdate() {
        DeliveryRequest request = new DeliveryRequest("123", "12 Main St", "John Doe", LocalDate.now());
        TaxiDriver driver = new TaxiDriver("Bob");
        assertEquals("Bob", driver.name);
    }

}