package main;

import main.characters.Hero;

public class GameOver {
    public GameOver(Hero hero) {
        System.out.println(hero.getName() + ", You Lose!!!");
        new Exit();
    }
}
