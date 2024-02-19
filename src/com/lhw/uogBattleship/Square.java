package com.lhw.uogBattleship;

public class Square {
    private int row;
    private int column;
    private boolean hasShip;
    private Battleship battleship;
    private boolean hasFired;


    public Square(int row, int column) {
        this.row = row;
        this.column = column;
        this.hasShip = false;
        this.battleship = null;
        this.hasFired = false;
    }


    public int getRow() {
        return row;
    }


    public int getColumn() {
        return column;
    }


    public boolean hasShip() {
        return hasShip;
    }


    public void placeShip(Battleship battleship) {
        this.hasShip = true;
        this.battleship = battleship;
    }


    public boolean hasFired() {
        return hasFired;
    }


    public void fireShot() {
        this.hasFired = true;
    }


    public Battleship getBattleship() {
        return battleship;
    }


    public String toString() {
//        if(hasShip){      //test the generating
//            return String.format("%3s", "A");
//        }
        if (!hasFired) {
            return String.format("%3s", "-");
        } else {
            if (hasShip) {
                return String.format("%3s", "x");
            } else {
                return String.format("%3s", "o");
            }
        }
    }
}
