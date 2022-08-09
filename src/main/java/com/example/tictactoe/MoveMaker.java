package com.example.tictactoe;

import javafx.scene.control.Button;


import java.util.List;



import static com.example.tictactoe.EmptyButtonListSelector.theEmptyButtonList;
import static com.example.tictactoe.ComputerWinnerFinder.findWinnerA;


public class MoveMaker {

    static String player = "PlayerA";
    private final ComputerMoveMaker computerMove;

    public MoveMaker(ComputerMoveMaker computerMove) {
        this.computerMove = computerMove;
    }

    public void makeMove(Button dupa, List<Button> theNewButtonsList) {

        dupa.setText("O");
        findWinnerA(theNewButtonsList);
        player = "Computer";
        dupa.setDisable(true);
        List<Button> theEmptyButtonList = theEmptyButtonList(theNewButtonsList);
        computerMove.computerMove(theEmptyButtonList);
        findWinnerA(theNewButtonsList);
        player = "PlayerA";
    }

}
