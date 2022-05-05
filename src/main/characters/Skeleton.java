package main.characters;

public class Skeleton extends Monster{

    public Skeleton() {
        this("Skeleton", 50, 10, 10, 10, 10);
    }

    public Skeleton(String name, int health, int gold, int dexterity, int experience, int power) {
        super(name, health, gold, dexterity, experience, power);
    }

    @Override
    public boolean attack(Characters characters) {
        characters.damage(this.getPower());
        return false;
    }
}
