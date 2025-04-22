package org.example;

public class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void makeMove(int row, int col, char currentMove) {
        if (board[row][col] == '-') {
            board[row][col] = currentMove;
        } else {
            throw new IllegalArgumentException("Cell already occupied!");
        }
    }

    public boolean checkWin(char c) {
        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == c && board[i][1] == c && board[i][2] == c) ||
                    (board[0][i] == c && board[1][i] == c && board[2][i] == c)) {
                return true;
            }
        }

        // Diagonals
        return (board[0][0] == c && board[1][1] == c && board[2][2] == c) ||
                (board[0][2] == c && board[1][1] == c && board[2][0] == c);
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

