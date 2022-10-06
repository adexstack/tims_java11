package OOPMasterChallenge;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sausage",3.50, "white roll");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.25);
        hamburger.addHamburgerAddition2("Lettuce", 0.20);
        hamburger.addHamburgerAddition3("Cheese", 0.50);
        System.out.println("total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.30);
        healthyBurger.addHamburgerAddition1("Egg", 3.20);
        //healthyBurger.itemizeHamburger();
        healthyBurger.addHealthyAddition2("Lentils", 5.20);
        System.out.println("total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("total Deluxe Burger price is " + deluxeBurger.itemizeHamburger());
        deluxeBurger.addHamburgerAddition1("Fries",2.34);

    }


}
