package com.course;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Hello in the game, enter the size of the board");
        int dimansion = new Scanner(System.in).nextInt();
        char currentPlayer = 'X';
        char[][] boardGame = new char [dimansion][dimansion];

                            /*{  {'X', 'O', 'X'},
                                {'X',  ' ', 'X'},
                                {'X', 'O', ' '}};*/

boolean orContinue = true;
int moveCounter = 0;
while(orContinue && moveCounter <= dimansion * dimansion) {
    TicTacToe.printBoard(boardGame);
    boolean correctMovement = makeMove(boardGame, currentPlayer);
    if (correctMovement) {

        boolean winningLines = cheackLines(boardGame, currentPlayer);
        boolean winningColumns = cheackColumns(boardGame, currentPlayer);
        boolean winningDiagonalsOne = cheackDiagonalsOne(boardGame, currentPlayer);
        //boolean winningDiagonalsTwo = cheackDiagonalsTwo(boardGame, currentPlayer);
        if (winningLines || winningColumns || winningDiagonalsOne) {
            System.out.println("Congratulations my friend! " + currentPlayer);
            orContinue = false;
        }

        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

  }

}

    public static boolean checkDiagonalsTwo(char[][] boardGame, char current) {
        int dimension = boardGame.length;
        for (int diagonals = 0; diagonals < dimension; diagonals++) {
            if (boardGame[diagonals][dimension - diagonals - 1] != current) {
                return false;
            }
        }
        return true;
    }
    public static boolean cheackDiagonalsOne(char[][] boardGame, char current){
        int dimension = boardGame.length;
        for (int diagonals = 0; diagonals < dimension; diagonals++) {
            if (boardGame[diagonals][diagonals] != current) {
                return false;
            }
        }
        return true;
    }
    public static boolean cheackLines(char[][] boardGame, char current) {
        int dimension = boardGame.length;
        for (int line = 0; line < dimension; line++) {
            boolean winner = true;
            for (int column = 0; column < dimension; column++) {
                if (boardGame[line][column] != current) {
                    winner = false;
                    break;
                }
            }
            if (winner) {return true;}
        }
        return false;
    }

    public static boolean cheackColumns(char[][] boardGame, char current) {
        int dimension = boardGame.length;
        for (int column = 0; column < dimension; column++) {
            boolean winner = true;
            for (int line = 0; line < dimension; line++) {
                if (boardGame[column][line] != current) {
                    winner = false;
                    break;
                }
            }
            if (winner) {return true;}
        }
        return false;
    }

    public static boolean makeMove(char[][] boardGame, char current) {
        System.out.println(current + " Yours move");
        System.out.println("Enter the index of the row");
        int newRow = new Scanner(System.in).nextInt();
        System.out.println("Enter the index of the column");
        int newColumn = new Scanner(System.in).nextInt();
        boolean correctMovement = boardGame[newRow][newColumn] == 0;
        if (!correctMovement) {
            System.out.println("Incorect movement!");
            return false;
        }
        boardGame[newRow][newColumn] = current;
        return true;
    }


    public static void printBoard(char[][] boardGame) {
        int dimansion = boardGame.length;

        //columns headers
        System.out.print("\t");
        for (int i = 0; i < dimansion; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();


        //board
        for (int row = 0; row < dimansion; row++) {
            System.out.print(row + ":\t");
            for (int column = 0; column < dimansion; column++) {
                System.out.print( boardGame[row][column] + "\t");
            }
            System.out.println();
        }
    }

}
