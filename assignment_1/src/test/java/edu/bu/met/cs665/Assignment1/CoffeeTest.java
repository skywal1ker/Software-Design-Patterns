package edu.bu.met.cs665.Assignment1;

import junit.framework.TestCase;

// extends the TestCase class from the JUnit framework
public class CoffeeTest extends TestCase {

    // test method to check the price of an espresso
    public void testEspresso() {
        // create a new instance of the Coffee class
        Coffee coffee = new Coffee();
        // call the espresso method on the Coffee instance
        coffee.espresso();
        // assert that the price of the espresso is 3.0
        // the third parameter (0.001) is the tolerance for the comparison
        assertEquals(3.0, coffee.getPrice(), 0.001);
    }

    // test method to check the price of an Americano
    public void testAmericano() {
        // create a new instance of the Coffee class
        Coffee coffee = new Coffee();
        // call the americano method on the Coffee instance
        coffee.americano();
        // assert that the price of the Americano is 3.0
        // the third parameter (0.001) is the tolerance for the comparison
        assertEquals(3.0, coffee.getPrice(), 0.001);
    }

    // test method to check the price of a Latte Macchiato
    public void testLatteMacchiato() {
        // create a new instance of the Coffee class
        Coffee coffee = new Coffee();
        // call the latteMacchiato method on the Coffee instance
        coffee.latteMacchiato();
        // assert that the price of the Latte Macchiato is 3.0
        // the third parameter (0.001) is the tolerance for the comparison
        assertEquals(3.0, coffee.getPrice(), 0.001);
    }
}
