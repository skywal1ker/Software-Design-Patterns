package edu.bu.met.cs665.Assignment1;

// Class VendingMachine defines the basic functions of a vending machine
class VendingMachine {
    double price;
    int milk;
    int sugar;

    // constructor to initialize milk and sugar to 0
    public VendingMachine() {
        this.milk = 0;
        this.sugar = 0;
    }

    // method to add milk to the machine
    public void addMilk() {
        // check if milk is less than 3
        if (this.milk < 3) {
            this.milk++;
            this.price += 0.5;
        }
        // if milk is already 3, print a message
        else System.out.println("Cannot add more than 3 milks.");
    }

    // method to add sugar to the machine
    public void addSugar() {
        // check if sugar is less than 3
        if (this.sugar < 3) {
            this.sugar++;
            this.price += 0.5;
        }
        // if sugar is already 3, print a message
        else {
            System.out.println("Cannot add more than 3 sugars.");
        }
    }

    // method to get the price
    public double getPrice() {
        return price;
    }

    // method to get the amount of milk
    public int getMilk() {
        return milk;
    }

    // method to get the amount of sugar
    public int getSugar() {
        return sugar;
    }

}

// Class Coffee extends VendingMachine and has the additional functions for coffee
class Coffee extends VendingMachine {
    // constructor to set the base price of coffee to $3.0
    public Coffee() {
        this.price = 3.0;
    }

    // method to select espresso
    public void espresso() {
        System.out.println("Espresso has been selected with price $" + this.price);
    }

    // method to select americano
    public void americano() {
        System.out.println("Americano has been selected with price $" + this.price);
    }

    // method to select latte macchiato
    public void latteMacchiato() {
        System.out.println("Latte Macchiato has been selected with price $" + this.price);
    }
}

// Class Tea extends VendingMachine and has the additional functions for tea
class Tea extends VendingMachine {
    // constructor to set the base price of tea to $2.0
    public Tea() {
        this.price = 2.0;
    }

    // method to select black tea
    public void blackTea() {
        System.out.println("Black Tea has been selected with price $" + this.price);
    }

    // method to select green tea
    public void greenTea() {
        System.out.println("Green Tea has been selected with price $" + this.price);
    }

    // method to select yellow tea
    public void yellowTea() {
        System.out.println("Yellow Tea has been selected with price $" + this.price);
    }
}
