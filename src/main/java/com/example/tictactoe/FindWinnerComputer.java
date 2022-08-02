package com.example.tictactoe;

import javafx.scene.control.Button;

import java.util.List;

import static com.example.tictactoe.FindWinner.*;
import static com.example.tictactoe.FindWinner.checkDiagonalsTwo;
import static com.example.tictactoe.MakeMove.player;

public class FindWinnerComputer {

    public static void findWinnerA(List<Button> theNewButtonsList) {
        if (player.contains("PlayerA")) {
            checkRows(theNewButtonsList);
            checkColumns(theNewButtonsList);
            checkDiagonals(theNewButtonsList);
        } else {
            checkRowsTwo(theNewButtonsList);
            checkColumnsTwo(theNewButtonsList);
            checkDiagonalsTwo(theNewButtonsList);
        }
    }

//    public static void findWinnerComputer(List<Button> theNewButtonsList) {
//        checkRowsTwo(theNewButtonsList);
//        checkColumnsTwo(theNewButtonsList);
//        checkDiagonalsTwo(theNewButtonsList);
//    }

}
