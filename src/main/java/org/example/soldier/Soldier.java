package org.example.soldier;

public class Soldier {
    int health;
    int strength;

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
