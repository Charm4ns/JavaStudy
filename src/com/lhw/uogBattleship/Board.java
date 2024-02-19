package com.lhw.uogBattleship;

import java.util.Random;

public class Board {
    private Square[][] grid;
    private int rows;
    private int columns;
    private int totalShips;
    private int sunkShips;


    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        grid = new Square[rows][columns];
        totalShips = 6;     //3+2+1
        sunkShips = 0;
        populateBoard();
        generateBattleships2();
    }


    //store the square array in the board
    private void populateBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = new Square(i, j);
            }
        }
    }


    //old function for part1-part4, which generates 5 2-size ships
//    private void generateBattleships1() {
//        Random random = new Random();
//        int battleshipCount = 5; // Assuming there are 5 battleships to be placed
//
//        while (battleshipCount > 0) {
//            int row = random.nextInt(grid.length);
//            int col = random.nextInt(grid[0].length);
//
//            boolean a = random.nextBoolean();
//
//            if (a) {
//                if (row + 1 < grid.length && !grid[row + 1][col].hasShip() && !grid[row][col].hasShip()) {
//                    Battleship battleship = new Battleship();
//                    grid[row + 1][col].placeShip(battleship);
//                    grid[row][col].placeShip(battleship);
//                    battleshipCount--;
//                }
//            } else {
//                if (col + 1 < grid[0].length && !grid[row][col + 1].hasShip() && !grid[row][col].hasShip()) {
//                    Battleship battleship = new Battleship();
//                    grid[row][col].placeShip(battleship);
//                    grid[row][col + 1].placeShip(battleship);
//                    battleshipCount--;
//                }
//            }
//        }
//    }


    //new function for part 5
    private void generateBattleships2() {
        Random random = new Random();
        int totalSmallBattleship = 3; // Assuming there are 5 battleships to be placed
        int totalMediumBattleship = 2; // Assuming there are 5 battleships to be placed
        int totalLargeBattleship = 1; // Assuming there are 5 battleships to be placed

        while (totalSmallBattleship > 0) {
            int row = random.nextInt(grid.length);
            int col = random.nextInt(grid[0].length);


            if (!grid[row][col].hasShip()) {
                SmallBattleship smallBattleship = new SmallBattleship();
                grid[row][col].placeShip(smallBattleship);
                totalSmallBattleship--;
            }
        }

        while (totalMediumBattleship > 0) {
            int row = random.nextInt(grid.length);
            int col = random.nextInt(grid[0].length);
            boolean a = random.nextBoolean();
            if (a) {
                if (row + 1 < grid.length && !grid[row + 1][col].hasShip() && !grid[row][col].hasShip()) {
                    MediumBattleship mediumBattleship = new MediumBattleship();
                    grid[row + 1][col].placeShip(mediumBattleship);
                    grid[row][col].placeShip(mediumBattleship);
                    totalMediumBattleship--;
                }
            } else {
                if (col + 1 < grid[0].length && !grid[row][col + 1].hasShip() && !grid[row][col].hasShip()) {
                    MediumBattleship mediumBattleship = new MediumBattleship();
                    grid[row][col].placeShip(mediumBattleship);
                    grid[row][col + 1].placeShip(mediumBattleship);
                    totalMediumBattleship--;
                }
            }
        }

        while (totalLargeBattleship > 0) {
            int row = random.nextInt(grid.length);
            int col = random.nextInt(grid[0].length);
            boolean a = random.nextBoolean();
            if (a) {
                if (row + 2 < grid.length && row + 1 < grid.length && !grid[row + 2][col].hasShip() && !grid[row + 1][col].hasShip() && !grid[row][col].hasShip()) {
                    LargeBattleship largeBattleship = new LargeBattleship();
                    grid[row + 2][col].placeShip(largeBattleship);
                    grid[row + 1][col].placeShip(largeBattleship);
                    grid[row][col].placeShip(largeBattleship);
                    totalLargeBattleship--;
                }
            } else {
                if (col + 2 < grid[0].length && col + 1 < grid[0].length && !grid[row][col + 2].hasShip() && !grid[row][col + 1].hasShip() && !grid[row][col].hasShip()) {
                    LargeBattleship largeBattleship = new LargeBattleship();
                    grid[row][col].placeShip(largeBattleship);
                    grid[row][col + 1].placeShip(largeBattleship);
                    grid[row][col + 2].placeShip(largeBattleship);
                    totalLargeBattleship--;
                }
            }
        }
    }


    public int fireShot(int row, int column) {
        Square square = grid[row][column];
        if (!square.hasFired() && square.hasShip()) {
            square.fireShot();
            square.getBattleship().decreaseHealth();
            System.out.println("Bingo");
            if (square.getBattleship().getHealth() == 0) {
                System.out.println("You destroyed a ship");
                square.getBattleship().isSunk = true;
                sunkShips++;
                if (sunkShips == totalShips) {      //all destroyed
                    return 3;
                }
                return 2;   //destroy one, but not all destroyed
            }
            return 1;   //hit one
        } else if (!square.hasFired() && !square.hasShip()) {
            square.fireShot();
            System.out.println("Miss");
            return 0;
        } else {
            System.out.println("Already been fired");
            return 0;
        }
    }


    public void showBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j].toString());
            }
            System.out.println();
        }
    }
}
