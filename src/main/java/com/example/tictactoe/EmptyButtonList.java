package com.example.tictactoe;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class EmptyButtonList {

    //Tutaj mogę zrobić zwracanie newButtonsList!


    public static List<Button> theEmptyButtonList(List<Button> theNewButtonsList) {

        List<Button> theEmptyButtonsList = new ArrayList<>();

        for (int i = 0; i < theNewButtonsList.size(); i++) {
            if (theNewButtonsList.get(i).getText().equals("")) {
                theEmptyButtonsList.add(theNewButtonsList.get(i));
            }
        }
        return theEmptyButtonsList;
    }


}
