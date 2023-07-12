package org.example.soldier;

public class Soldier {
    int health;
    int strength;

    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public int attack() {
        int strength1 = this.strength;
        return (strength1);
    }

    public int receiveDamage(int damage) {
        this.health = this.health - damage;
        int health1 = this.health;
        return(health1);
    }
}
