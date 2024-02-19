package com.lhw.uogBattleship;

import java.util.Scanner;

public class Player {
    private String name;
    private Board board;
    private int score;


    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
        this.score = 0;
    }


    public String getName() {
        return name;
    }


    public Board getBoard() {
        return board;
    }


    public int getScore() {
        return score;
    }


    public void increaseScore() {
        this.score++;
    }


    public boolean takeTurn(Player opponent) {
        this.board.showBoard();     //show board every round
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        int column = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(this.name +  ", enter your guess (row column): ");
            row = scanner.nextInt();
            column = scanner.nextInt();


            if (row >= 0 && row < 10 && column >= 0 && column < 10) {       //determine whether the input valid
                validInput = true;
            } else {
                System.out.println("Invalid input. Row and column must be between 0 and 9.");
            }
        }
        int isHit = this.board.fireShot(row, column);
        if (isHit == 2) {       //receive the return value of fireShot()
            this.increaseScore();
        } else if (isHit == 3) {
            this.increaseScore();
            return true;    //destroy all ships, game over
        }
        return false;
    }
}
