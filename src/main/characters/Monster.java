package main.characters;

public abstract class Monster extends Characters implements Attackable {

    public Monster(String name, int health, int gold, int dexterity, int experience, int power) {
        super(name, health, gold, dexterity, experience, power);
    }



}
