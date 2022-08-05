package com.example.tictactoe;

import javafx.scene.control.Button;

import java.util.List;

import static com.example.tictactoe.FindWinner.*;
import static com.example.tictactoe.FindWinner.checkDiagonalsTwo;
import static com.example.tictactoe.MakeMove.player;

public class FindWinnerComputer {

    public static void findWinnerA(List<Button> theNewButtonsList) {
        if (player.contains("PlayerA")) {
            checkRowsTwo(theNewButtonsList, "Player A won!", "O");
            checkColumnsTwo(theNewButtonsList, "Player A won!", "O");
            checkDiagonalsTwo(theNewButtonsList, "Player A won!", "O");
        } else {
            checkRowsTwo(theNewButtonsList, "Computer won!", "X");
            checkColumnsTwo(theNewButtonsList, "Computer won!", "X");
            checkDiagonalsTwo(theNewButtonsList, "Computer won!", "X");
        }
    }

}
