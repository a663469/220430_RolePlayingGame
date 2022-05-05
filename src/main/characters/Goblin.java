package main.characters;

public class Goblin extends Monster{

    public Goblin(String name, int health, int gold, int dexterity, int experience, int power) {
        super(name, health, gold, dexterity, experience, power);
    }

    @Override
    public boolean attack(Characters characters) {
        characters.damage(this.getPower());
        return false;
    }
}
