package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {

    String name;
    public int health;
    int strength;
    String msg;

    public Vikings(String name, int health, int strength){
        super(health, strength);
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public String getMsg() {
        return msg;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int attack(){
        return(this.strength);
    }

    public int receiveDamage(int damage){
        this.health = this.health - damage;
        if (this.health>0){
            msg = this.name + "has received" + damage + "points of damage";
        }
        else msg = this.name + "has died in combat";
        return(this.health);
    }

    public String battleCry(){
        return ("Odin Owns You All!");
    }

    public String getName() {
        return(this.name);
    }
}
