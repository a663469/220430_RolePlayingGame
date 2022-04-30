package main;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Please enter the name of the character: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Hero hero = new Hero(name);
        System.out.println("Welcome " + hero.getName());
        System.out.println(hero);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (s.equals("exit")) break;

        }
    }
}
