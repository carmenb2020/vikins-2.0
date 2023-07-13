package org.example.saxon;

import org.example.soldier.Soldier;
public class Saxon extends Soldier {

    public int health;
    int strength;

    String msg;

    public Saxon(int health, int strength) {
        super(health, strength);
        this.health = health;
        this.strength = strength;
    }

    public String getMsg() {
        return (msg);
    }
    public int getHealth() {
        return (this.health);
    }

    public void setHealth(int health) {
        this.health=health;
    }

    public int getStrength() {
        return(this.strength);
    }
    public int attack(){
        return (this.strength);
    }

    public int receiveDamage(int damage){
        this.health = this.health - damage;
        if (this.health > 0) {
            msg = "A Saxon has received" + damage + "points of damage";
        }
        else  msg = "A Saxon has died in combat";
        return (this.health);
    }

}
