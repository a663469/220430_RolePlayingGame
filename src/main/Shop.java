package main;

public class Shop implements Runnable{

    public Shop() {
    }

    private void welcome() {
        System.out.println("Welcome to the Shop!");
    }

    private void products()  {
        System.out.println("What would you like to buy?");
        System.out.println("1. Treatment potion");

    }

    @Override
    public void run() {
        welcome();
        products();
    }
}
