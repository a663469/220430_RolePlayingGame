package main;

import main.characters.Hero;

import java.util.Scanner;

public class Shop implements Runnable{

    Hero hero;
    public Shop(Hero hero) {
        this.hero = hero;
    }

    private void welcome() {
        System.out.println("Welcome to the Shop!");
    }

    private void products()  {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What would you like to buy?");
            System.out.println("1. Healing potion. price: 10 gold, healing: +50");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case (0) :
                    new Exit();
                    return;
                case (1) :
                {
                    int price = 10;
                    int healing = 50;
                    if(hero.withdrawGold(price) == price) {
                        if(!hero.addHealth(healing)) {
                            hero.addGold(price);
                        } else {
                            System.out.println(hero);
                        }
                    }
                }
                    break;
                default:
                    System.out.println("There is no such option yet!");
                    break;
            }

        }
    }

    @Override
    public void run() {
        welcome();
        products();
    }
}
