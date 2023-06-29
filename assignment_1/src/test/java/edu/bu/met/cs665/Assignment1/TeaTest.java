package edu.bu.met.cs665.Assignment1;

import junit.framework.TestCase;


// extends the TestCase class from the JUnit framework
public class TeaTest extends TestCase {

    // test method to check the price of a Black Tea
    public void testBlackTea() {
        // create a new instance of the Tea class
        Tea tea = new Tea();
        // call the blackTea method on the Tea instance
        tea.blackTea();
        // assert that the price of the Black Tea is 2.0
        // the third parameter (0.001) is the tolerance for the comparison
        assertEquals(2.0, tea.getPrice(), 0.001);
    }

    // test method to check the price of a Green Tea
    public void testGreenTea() {
        // create a new instance of the Tea class
        Tea tea = new Tea();
        // call the greenTea method on the Tea instance
        tea.greenTea();
        // assert that the price of the Green Tea is 2.0
        // the third parameter (0.001) is the tolerance for the comparison
        assertEquals(2.0, tea.getPrice(), 0.001);
    }

    // test method to check the price of a Yellow Tea
    public void testYellowTea() {
        // create a new instance of the Tea class
        Tea tea = new Tea();
        // call the yellowTea method on the Tea instance
        tea.yellowTea();
        // assert that the price of the Yellow Tea is 2.0
        // the third parameter (0.001) is the tolerance for the comparison
        assertEquals(2.0, tea.getPrice(), 0.001);
    }
}
