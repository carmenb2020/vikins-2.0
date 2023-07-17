package org.example.soldier;

public class Soldier {
    private int health;

    private int strength;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public int attack() {
      return (this.strength);
    }

    public int receiveDamage(int damage) {
        this.health = this.health - damage;
        return(this.health);
    }
}
