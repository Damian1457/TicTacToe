package com.example.tictactoe;

import javafx.scene.control.Button;

import java.util.List;

public class ComputerMoveMaker {

    public void computerMove(List<Button> theEmptyButtonsList) {
        if (!theEmptyButtonsList.isEmpty()) {
            Button newButton = theEmptyButtonsList.get(0);
            newButton.setText("X");
            newButton.setDisable(true);
        }
    }

}
