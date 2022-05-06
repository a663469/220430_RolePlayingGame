package main;

import main.characters.Hero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Please enter the name of the character: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Hero hero = new Hero(name);
        Shop shop = new Shop(hero);
        DarkForest darkForest = new DarkForest(hero);

        System.out.println("Welcome " + hero.getName());
        System.out.println(hero);

        while (true) {
            System.out.println();
            System.out.println(hero);
            System.out.println();
            System.out.println("Where do you want to go?");
            System.out.println("1. To the merchant");
            System.out.println("2. Into the dark forest");
            System.out.println("0. To the exit");
            if(scanner.hasNextLine()) {
                try {
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case (0):
                            new Exit();
                            return;
                        case (1):
                            Thread threadShop = new Thread(shop);
                            threadShop.start();
                            threadShop.join();
                            break;
                        case (2):
                            Thread threadDarkForest = new Thread(darkForest);
                            threadDarkForest.start();
                            threadDarkForest.join();
//                            Skeleton skeleton = new Skeleton();
//                            System.out.println(hero);
//                            System.out.println(skeleton);
//                            hero.attack(skeleton);
//                            System.out.println(hero);
//                            System.out.println(skeleton);
                            break;
                        default:
                            System.out.println("There is no such option yet!");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    continue;
                }
            }
            if(hero.getHealth() == 0) {
                new GameOver(hero);
                return;
            }
        }
    }
}