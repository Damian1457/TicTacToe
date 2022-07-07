package com.example.tictactoe;

import javafx.scene.control.Button;

import java.util.List;

public class EmptyButtonList {

    public static void emptyButtonList(List<Button> theNewButtonsList, List<Button> theEmptyButtonsList ) {
        for (int i = 0; i < theNewButtonsList.size(); i++) {
            if (theNewButtonsList.get(i).getText().equals("")) {
                theEmptyButtonsList.add(theNewButtonsList.get(i));
            }
        }
    }

}
