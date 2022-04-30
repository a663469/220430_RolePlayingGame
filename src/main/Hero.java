package main;

public class Hero extends Characters implements Attackable{

    public Hero() {
        this("SuperHero");
    }

    public Hero(String name) {
        this(name, 100, 1000, 10, 10, 10);
    }

    public Hero(String name, int health, int gold, int dexterity, int experience, int power) {
        super(name, health, gold, dexterity, experience, power);
    }

    @Override
    public boolean attack() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
