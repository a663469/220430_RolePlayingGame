package main.characters;

import java.util.Random;

public abstract class Characters implements Attackable {
    private String name;
    private int health;
    private int gold;
    private int dexterity;
    private int experience;
    private int power;
    private int level;

    public Characters(String name, int health, int gold, int dexterity, int experience, int power) {
        this.name = name;
        this.health = health;
        this.gold = gold;
        this.dexterity = dexterity;
        this.experience = experience;
        this.power = power;
        this.level = 1;
    }

    @Override
    public String toString() {
        return "main.characters.Characters{" +
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

    public boolean addHealth(int health) {
        if(this.health != 100 && this.health != 0) {
            if (this.health + health < 100) {
                this.health += health;
            } else {
                this.health = 100;
            }
            return true;
        } else {
            return false;
        }
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

    public boolean addExperience(int x) {
        experience += x;
        //level up!
        if(experience > 100) {
            experience -= 100;
            power += 10;
            level++;
        }
        return true;
    }

    public boolean addGold(int x) {
        gold += x;
        return true;
    }

    public int withdrawAllGold() {
        int x = gold;
        gold = 0;
        return x;
    }

    public int withdrawGold(int price) {
        if(this.gold >= price) {
            this.gold -= price;
            return price;
        } else {
            return 0;
        }
    }

    public boolean damage(int d) {
        boolean retVal = (health > 0);
        if((new Random()).nextInt(200) > (this.dexterity + this.experience)) {
            if (health - d >= 0) {
                health = health - d;
                System.out.println("Damage -" + d);
            } else {
                System.out.println("Damage -" + health);
                health = 0;
            }
        } else {
            System.out.println("Missed!!!");
        }
        System.out.println();
        return retVal;
    }
}
