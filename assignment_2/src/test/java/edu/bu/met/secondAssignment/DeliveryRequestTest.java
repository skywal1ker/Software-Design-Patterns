package edu.bu.met.secondAssignment;

import junit.framework.TestCase;
import java.time.LocalDate;

public class DeliveryRequestTest extends TestCase {

    public void testGetId() {
        DeliveryRequest request = new DeliveryRequest("1", "119 Sutherland Road", "Jack Daniels", LocalDate.now());
        assertEquals("1", request.getId());
    }

    public void testGetAddress() {
        DeliveryRequest request = new DeliveryRequest("1", "119 Sutherland Road", "Jack Daniels", LocalDate.now());
        assertEquals("119 Sutherland Road", request.getAddress());
    }

    public void testGetCustomerName() {
        DeliveryRequest request = new DeliveryRequest("1", "119 Sutherland Road", "Jack Daniels", LocalDate.now());
        assertEquals("Jack Daniels", request.getCustomerName());
    }

    public void testGetDeliveryDate() {
        DeliveryRequest request = new DeliveryRequest("1", "119 Sutherland Road St.", "Jack Daniels", LocalDate.now());
        assertEquals(LocalDate.now(), request.getDeliveryDate());
    }

    public void testSetDeliveryDate() {
        String id = "123";
        String address = "123 Main St";
        String customerName = "John Doe";
        LocalDate deliveryDate = LocalDate.now();
        DeliveryRequest request = new DeliveryRequest(id, address, customerName, deliveryDate);
        LocalDate newDate = LocalDate.of(2023, 3, 1);
        request.setDeliveryDate(newDate);
        assertEquals(newDate, request.getDeliveryDate());
    }

    public void testToString() {
        String id = "123";
        String address = "123 Main St";
        String customerName = "John Doe";
        LocalDate deliveryDate = LocalDate.now();
        DeliveryRequest request = new DeliveryRequest(id, address, customerName, deliveryDate);
        String expected = "Delivery request #123 for John Doe at 123 Main St with delivery date of 2023-02-23";
        assertEquals(expected, request.toString());
    }
}