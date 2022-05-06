package main;

import main.characters.Goblin;
import main.characters.Hero;
import main.characters.Skeleton;

import java.util.Random;

public class DarkForest implements Runnable{
    Hero hero;

    public DarkForest(Hero hero) {
        this.hero = hero;
    }

    private void welcome() {
        System.out.println("May the force come with you in the Dark Forest!");
    }

    @Override
    public void run() {
        welcome();
        try {
            Thread thread = new Thread(new Battle(hero, (new Random().nextBoolean()) ? new Skeleton() : new Goblin()));
            thread.start();
            thread.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
