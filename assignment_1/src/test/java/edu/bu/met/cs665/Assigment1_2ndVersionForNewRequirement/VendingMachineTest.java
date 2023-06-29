package edu.bu.met.cs665.Assigment1_2ndVersionForNewRequirement;

import junit.framework.TestCase;

public class VendingMachineTest extends TestCase {

    public void testEspresso() {
        Coffee coffee = new Coffee();
        coffee.espresso();
        assertEquals(3.0, coffee.getPrice());
    }

    public void testAmericano() {
        Coffee coffee = new Coffee();
        coffee.americano();
        assertEquals(3.0, coffee.getPrice());
    }

    public void testLatteMacchiato() {
        Coffee coffee = new Coffee();
        coffee.latteMacchiato();
        assertEquals(3.0, coffee.getPrice());
    }

    public void testBlackTea() {
        Tea tea = new Tea();
        tea.blackTea();
        assertEquals(2.0, tea.getPrice());
    }

    public void testGreenTea() {
        Tea tea = new Tea();
        tea.greenTea();
        assertEquals(2.0, tea.getPrice());
    }

    public void testYellowTea() {
        Tea tea = new Tea();
        tea.yellowTea();
        assertEquals(2.0, tea.getPrice());
    }

    public void testAddMilk() {
        Tea tea = new Tea();
        tea.milk.addMilk(tea);
        tea.milk.addMilk(tea);
        tea.milk.addMilk(tea);
        tea.milk.addMilk(tea);
        tea.milk.addMilk(tea);
        assertEquals(3, tea.milk.getMilkAmount());
    }

    public void testAddSugar() {
        Coffee coffee = new Coffee();
        coffee.sugar.addSugar(coffee);
        coffee.sugar.addSugar(coffee);
        coffee.sugar.addSugar(coffee);
        coffee.sugar.addSugar(coffee);
        assertEquals(3, coffee.sugar.getSugarAmount());
    }



}