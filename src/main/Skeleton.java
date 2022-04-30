package main;

public class Skeleton extends Monster{
    public Skeleton(String name, int health, int gold, int dexterity, int experience, int power) {
        super(name, health, gold, dexterity, experience, power);
    }

    @Override
    public boolean attack() {
        return false;
    }
}
