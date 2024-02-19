package com.lhw.uogBattleship;

public class Battleship {
    public boolean isSunk;
    private int size;
    private int health;


    public Battleship(int size, int health) {
        this.size = size;
        this.health = health;
        this.isSunk = false;
    }


    public int getHealth() {
        return health;
    }


    public void decreaseHealth() {
        if (health > 0) {
            health--;
        }
    }


    public boolean isDestroyed() {
        return health == 0;
    }
}
