package com.example.tictactoe;

import javafx.scene.control.Button;


import java.util.List;



import static com.example.tictactoe.EmptyButtonList.theEmptyButtonList;
import static com.example.tictactoe.FindWinnerComputer.findWinnerA;


public class MakeMove {

    static String player = "PlayerA";
    private final ComputerMove computerMove;

    public MakeMove(ComputerMove computerMove) {
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
