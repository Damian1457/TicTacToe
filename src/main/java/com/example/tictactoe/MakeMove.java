package com.example.tictactoe;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

import static com.example.tictactoe.ComputerMove.computerMove;
import static com.example.tictactoe.EmptyButtonList.emptyButtonList;
import static com.example.tictactoe.FindWinnerComputer.findWinnerA;
import static com.example.tictactoe.FindWinnerComputer.findWinnerComputer;

public class MakeMove {

    static String player = "PlayerA";

    public static void makeMove(Button dupa, List<Button> theNewButtonsList) {

        dupa.setText("O");
        findWinnerA(theNewButtonsList);
        List<Button> theEmptyButtonsList = new ArrayList<>();
        player = "Computer";
        dupa.setDisable(true);
        emptyButtonList(theNewButtonsList, theEmptyButtonsList);
        computerMove(theEmptyButtonsList);
        findWinnerComputer(theNewButtonsList);
        player = "PlayerA";
    }

}
