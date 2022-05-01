package main;

public abstract class Characters implements Attackable{
    private String name;
    private int health;
    private int gold;
    private int dexterity;
    private int experience;
    private int power;

    public Characters(String name, int health, int gold, int dexterity, int experience, int power) {
        this.name = name;
        this.health = health;
        this.gold = gold;
        this.dexterity = dexterity;
        this.experience = experience;
        this.power = power;
    }

    @Override
    public String toString() {
        return "main.Characters{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", gold=" + gold +
                ", dexterity=" + dexterity +
                ", experience=" + experience +
                ", power=" + power +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getGold() {
        return gold;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getExperience() {
        return experience;
    }

    public int getPower() {
        return power;
    }

    public void damage(int d) {
        if(health - d >= 0) {
            health = health - d;
            System.out.println("Damage -" + d);
        } else {
            System.out.println("Damage -" + health);
            health = 0;
        }
    }
}
