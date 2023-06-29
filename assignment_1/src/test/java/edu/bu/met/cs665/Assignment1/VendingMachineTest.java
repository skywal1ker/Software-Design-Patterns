package edu.bu.met.cs665.Assignment1;

import junit.framework.TestCase;

public class VendingMachineTest extends TestCase {

    // Test case to verify the quantity of milk after adding it multiple times
    public void testAddMilk() {
        // Instantiating the VendingMachine class
        VendingMachine vendingMachine = new VendingMachine();

        // Adding milk 4 times
        vendingMachine.addMilk();
        vendingMachine.addMilk();
        vendingMachine.addMilk();
        vendingMachine.addMilk();

        // Checking if the quantity of milk is 3
        assertEquals(3, vendingMachine.getMilk());
    }

    // Test case to verify the quantity of sugar after adding it multiple times
    public void testAddSugar() {
        // Instantiating the VendingMachine class
        VendingMachine vendingMachine = new VendingMachine();

        // Adding sugar 4 times
        vendingMachine.addSugar();
        vendingMachine.addSugar();
        vendingMachine.addSugar();
        vendingMachine.addSugar();

        // Checking if the quantity of sugar is 3
        assertEquals(3, vendingMachine.getSugar());
    }

    // Test case to verify the price of the drink
    public void testGetPrice() {
        // Instantiating the VendingMachine class
        VendingMachine vendingMachine = new VendingMachine();

        // Adding milk 4 times
        vendingMachine.addMilk();
        vendingMachine.addMilk();
        vendingMachine.addMilk();
        vendingMachine.addMilk();

        // Adding sugar 4 times
        vendingMachine.addSugar();
        vendingMachine.addSugar();
        vendingMachine.addSugar();
        vendingMachine.addSugar();

        // Checking if the price of the drink is 3.0
        assertEquals(3.0, vendingMachine.getPrice());

    }

    // Test case to verify the quantity of milk
    public void testGetMilk() {
        // Instantiating the VendingMachine class
        VendingMachine vendingMachine = new VendingMachine();

        // Adding milk 4 times
        vendingMachine.addMilk();
        vendingMachine.addMilk();
        vendingMachine.addMilk();
        vendingMachine.addMilk();

        // Checking if the quantity of milk is 3
        assertEquals(3, vendingMachine.getMilk());

    }

    // Test case to verify the quantity of sugar
    public void testGetSugar() {
        // Instantiating the VendingMachine class
        VendingMachine vendingMachine = new VendingMachine();

        // Adding sugar 4 times
        vendingMachine.addSugar();
        vendingMachine.addSugar();
        vendingMachine.addSugar();
        vendingMachine.addSugar();

        // Checking if the quantity of sugar is 3
        assertEquals(3, vendingMachine.getSugar());

    }
}
