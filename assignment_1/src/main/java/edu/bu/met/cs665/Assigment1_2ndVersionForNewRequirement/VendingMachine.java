package edu.bu.met.cs665.Assigment1_2ndVersionForNewRequirement;


// Class VendingMachine defines the basic functions of a vending machine
class VendingMachine {
    double price;

    // constructor to initialize the price
    public VendingMachine() {
        this.price = 0;
    }

    // method to get the price
    public double getPrice() {
        return price;
    }
}

// Class Milk defines the milk functionality in a vending machine
class Milk {
    int milkAmount;

    // constructor to initialize milk to 0
    public Milk() {
        this.milkAmount = 0;
    }

    // method to add milk to the machine
    public void addMilk(VendingMachine machine) {
        // check if milk is less than 3
        if (this.milkAmount < 3) {
            this.milkAmount++;
            machine.price += 0.5;
        }
        // if milk is already 3, print a message
        else System.out.println("Cannot add more than 3 milks.");
    }

    // method to get the amount of milk
    public int getMilkAmount() {
        return milkAmount;
    }
}

// Class Sugar defines the sugar functionality in a vending machine
class Sugar {
    int sugarAmount;

    // constructor to initialize sugar to 0
    public Sugar() {
        this.sugarAmount = 0;
    }

    // method to add sugar to the machine
    public void addSugar(VendingMachine machine) {
        // check if sugar is less than 3
        if (this.sugarAmount < 3) {
            this.sugarAmount++;
            machine.price += 0.5;
        }
        // if sugar is already 3, print a message
        else {
            System.out.println("Cannot add more than 3 sugars.");
        }
    }

    // method to get the amount of sugar
    public int getSugarAmount() {
        return sugarAmount;
    }
}


// Class Tea extends VendingMachine and has the additional functions for coffee
class Tea extends VendingMachine {
    Milk milk;
    Sugar sugar;

    // constructor to set the base price of coffee to $3.0
    public Tea() {
        this.price = 2.0;
        this.milk = new Milk();
        this.sugar = new Sugar();
    }

    // method to select Black tea
    public void blackTea() {
        System.out.println("Black tea has been selected with price $" + this.price);
    }

    // method to select yellow Tea
    public void yellowTea() {
        System.out.println("Yellow tea has been selected with price $" + this.price);
    }

    // method to select Green Tea
    public void greenTea() {
        System.out.println("Green tea has been selected with price $" + this.price);
    }

}


// Class Coffee extends VendingMachine and has the additional functions for coffee
class Coffee extends VendingMachine {
    Milk milk;
    Sugar sugar;

    // constructor to set the base price of coffee to $3.0
    public Coffee() {
        this.price = 3.0;
        this.milk = new Milk();
        this.sugar = new Sugar();
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

