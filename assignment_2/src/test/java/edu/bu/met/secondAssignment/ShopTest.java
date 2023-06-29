package edu.bu.met.secondAssignment;

import junit.framework.TestCase;

import java.time.LocalDate;

public class ShopTest extends TestCase {

    public void testAddDeliveryRequest() {
        // Create a shop
        Shop shop = new Shop("testMyShop");

        // Create a delivery request
        DeliveryRequest request = new DeliveryRequest("1", "1010 Comm Av.", "Freddie Krueger", LocalDate.now());

        // Add delivery request to the shop
        shop.addDeliveryRequest(request);

        // Check that the shop has changed and notified its observers
        assertFalse(shop.hasChanged());
    }




}

