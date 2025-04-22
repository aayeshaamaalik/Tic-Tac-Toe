package org.example;

import java.util.Scanner;

public class TicTacToe {
    private Board board;
    private char currentMove;

    public TicTacToe() {
        board = new Board();
        currentMove = 'X';  // X always starts
    }

    public void changePlayer() {
        currentMove = (currentMove == 'X') ? 'O' : 'X';
    }

    public void makeMove(int row, int col) {
        board.makeMove(row, col, currentMove);
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            board.printBoard();
            System.out.println("Player " + currentMove + ", enter row and column (0-2):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            try {
                makeMove(row, col);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            if (board.checkWin(currentMove)) {
                board.printBoard();
                System.out.println("Player " + currentMove + " wins!");
                break;
            }

            if (board.isBoardFull()) {
                board.printBoard();
                System.out.println("Game is a draw!");
                break;
            }

            changePlayer();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        new TicTacToe().startGame();
    }
}

