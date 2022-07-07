package com.example.tictactoe;

import javafx.scene.control.Button;

import java.util.List;

import static com.example.tictactoe.FindWinner.*;
import static com.example.tictactoe.FindWinner.checkDiagonalsTwo;

public class FindWinnerComputer {

    public static void findWinnerA(List<Button> theNewButtonsList) {
        checkRows(theNewButtonsList);
        checkColumns(theNewButtonsList);
        checkDiagonals(theNewButtonsList);
    }

    public static void findWinnerComputer(List<Button> theNewButtonsList) {
        checkRowsTwo(theNewButtonsList);
        checkColumnsTwo(theNewButtonsList);
        checkDiagonalsTwo(theNewButtonsList);
    }

}
