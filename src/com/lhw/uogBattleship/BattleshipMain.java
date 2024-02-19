package com.lhw.uogBattleship;

import java.util.Scanner;

public class BattleshipMain {
    public static void main(String[] args) {
        //enter the names
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Player 1's name: ");
        String player1Name = scanner.nextLine();
        System.out.print("Enter Player 2's name: ");
        String player2Name = scanner.nextLine();
        Board board = new Board(10, 10);    //create a 10*10 board
        Player player1 = new Player(player1Name, board);
        Player player2 = new Player(player2Name, board);


        Player currentPlayer = player1;
        Player opponent = player2;
        boolean gameOver = currentPlayer.takeTurn(opponent);    //determine when the program stops

        while(!gameOver){
            currentPlayer.takeTurn(opponent);   //change the current player
            Player temp = currentPlayer;
            currentPlayer = opponent;
            opponent = temp;
            gameOver = currentPlayer.takeTurn(opponent);
        }
        System.out.println(player1Name + " " + player1.getScore());     //show the scores
        System.out.println(player2Name + " " + player2.getScore());
        System.out.println(opponent.getName() + " has sunk the final battleship! Game over!");
    }
}
