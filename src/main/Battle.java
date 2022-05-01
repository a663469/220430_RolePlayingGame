package main;

import java.util.Random;

public class Battle implements Runnable {
    Characters chr1;
    Characters chr2;

    public Battle(Characters chr1, Characters chr2) {
        this.chr1 = chr1;
        this.chr2 = chr2;
    }

    public void battleHeroVsMonster(Characters chr1, Characters chr2) {
        this.chr1 = chr1;
        this.chr2 = chr2;
    }

    private boolean fight() {
        System.out.println("Fight!!!");
        boolean move = new Random().nextBoolean();

        while (chr1.getHealth() > 0 && chr2.getHealth() > 0) {
            if(move) {
                System.out.println(chr1.getName() + " attacking  " + chr2.getName());
                chr1.attack(chr2);
            } else {
                System.out.println(chr2.getName() + " attacking  " + chr1.getName());
                chr2.attack(chr1);
            }
            move = !move;
        }

        if(chr1.getHealth() > 0) {
            System.out.println(chr1.getName() + " has won!!!");
        } else {
            System.out.println(chr2.getName() + " has won!!!");
        }
        return false;
    }
    @Override
    public void run() {
        fight();
    }
}
