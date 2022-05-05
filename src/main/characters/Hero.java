package main.characters;

import java.util.Random;

public class Hero extends Characters implements Attackable {

    public Hero() {
        this("SuperHero");
    }

    public Hero(String name) {
        this(name, 100, 0, 10, 0, 10);
    }

    public Hero(String name, int health, int gold, int dexterity, int experience, int power) {
        super(name, health, gold, dexterity, experience, power);
    }

    @Override
    public boolean attack(Characters characters) {
        int nxt = (new Random()).nextInt(100);
        int critical  = nxt < this.getDexterity() + this.getExperience() ? 2 : 1;
        if (characters.damage(this.getPower() * critical)) {
            if(characters.getHealth() == 0) {
                this.addExperience(10);
                this.addGold(characters.withdrawAllGold());
            } else {
                this.addExperience(1);
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
