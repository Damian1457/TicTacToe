package com.example.tictactoe;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

import java.util.List;

public class FindWinner {



    //Wynieść do argumentów metody "X" i "0" oraz "Computer won" i "PlayerA won"!


    public static void checkDiagonalsTwo(List<Button> theNewButtonsList, String message, String sine) {



        if (theNewButtonsList.get(0).getText().equals(theNewButtonsList.get(4).getText()) &&
                theNewButtonsList.get(4).getText().equals(theNewButtonsList.get(8).getText()) && theNewButtonsList.get(0).getText().equals(sine)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
            alert.show();
            setDisable(theNewButtonsList);
        }
        else if (theNewButtonsList.get(2).getText().equals(theNewButtonsList.get(4).getText()) &&
                theNewButtonsList.get(4).getText().equals(theNewButtonsList.get(6).getText()) && theNewButtonsList.get(2).getText().equals(sine)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
            alert.show();
            setDisable(theNewButtonsList);
        }
    }

    public static void checkColumnsTwo(List<Button> theNewButtonsList, String message, String sine) {

        if (theNewButtonsList.get(0).getText().equals(theNewButtonsList.get(3).getText()) &&
                theNewButtonsList.get(3).getText().equals(theNewButtonsList.get(6).getText()) && theNewButtonsList.get(0).getText().equals(sine)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
            alert.show();
            setDisable(theNewButtonsList);
        }
        else if (theNewButtonsList.get(1).getText().equals(theNewButtonsList.get(4).getText()) &&
                theNewButtonsList.get(4).getText().equals(theNewButtonsList.get(7).getText()) && theNewButtonsList.get(1).getText().equals(sine)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
            alert.show();
            setDisable(theNewButtonsList);
        }
        else if (theNewButtonsList.get(2).getText().equals(theNewButtonsList.get(5).getText()) &&
                theNewButtonsList.get(5).getText().equals(theNewButtonsList.get(8).getText()) && theNewButtonsList.get(2).getText().equals(sine)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
            alert.show();
            setDisable(theNewButtonsList);
        }
    }

    public static void checkRowsTwo(List<Button> theNewButtonsList, String message, String sine) {

        if (theNewButtonsList.get(0).getText().equals(theNewButtonsList.get(1).getText()) &&
                theNewButtonsList.get(1).getText().equals(theNewButtonsList.get(2).getText()) && theNewButtonsList.get(0).getText().equals(sine)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
            alert.show();
            setDisable(theNewButtonsList);
        }
        else if (theNewButtonsList.get(3).getText().equals(theNewButtonsList.get(4).getText()) &&
                theNewButtonsList.get(4).getText().equals(theNewButtonsList.get(5).getText()) && theNewButtonsList.get(3).getText().equals(sine)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
            alert.show();
            setDisable(theNewButtonsList);
        }
        else if (theNewButtonsList.get(6).getText().equals(theNewButtonsList.get(7).getText()) &&
                theNewButtonsList.get(7).getText().equals(theNewButtonsList.get(8).getText()) && theNewButtonsList.get(6).getText().equals(sine)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
            alert.show();
            setDisable(theNewButtonsList);
        }
    }

    public static void setDisable(List<Button> theNewButtonsList) {
        for (int i = 0; i < theNewButtonsList.size(); i++) {
            theNewButtonsList.get(i).setDisable(true);
        }
    }

}
