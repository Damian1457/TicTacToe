package com.example.tictactoe;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;


public class TicTacToe2 extends Application {

    String player = "PlayerA";
    Button buttonQuit = new Button("Quit Game");
    Button buttonNew = new Button("New Game");

    public boolean isPlayerA() {
        return player.equals("PlayerA");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        ComputerMoveMaker computerMove = new ComputerMoveMaker();
        MoveMaker makeMove = new MoveMaker(computerMove);


        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();
        Button button6 = new Button();
        Button button7 = new Button();
        Button button8 = new Button();
        Button button9 = new Button();

        List<Button> tneNewButtonsList = new ArrayList<>();
        tneNewButtonsList.add(button1);
        tneNewButtonsList.add(button2);
        tneNewButtonsList.add(button3);
        tneNewButtonsList.add(button4);
        tneNewButtonsList.add(button5);
        tneNewButtonsList.add(button6);
        tneNewButtonsList.add(button7);
        tneNewButtonsList.add(button8);
        tneNewButtonsList.add(button9);



        //button1
        button1.setOnMouseClicked(e -> {
            makeMove.makeMove(button1, tneNewButtonsList);
        });

        //button2
        button2.setOnMouseClicked(e -> {
            makeMove.makeMove(button2, tneNewButtonsList);
        });

        //button3
        button3.setOnMouseClicked(e -> {
            makeMove.makeMove(button3, tneNewButtonsList);
        });

        //button4
        button4.setOnMouseClicked(e -> {
            makeMove.makeMove(button4, tneNewButtonsList);
        });

        //button5
        button5.setOnMouseClicked(e -> {
            makeMove.makeMove(button5, tneNewButtonsList);
        });

        //button6
        button6.setOnMouseClicked(e -> {
            makeMove.makeMove(button6, tneNewButtonsList);
        });

        //button7
        button7.setOnMouseClicked(e -> {
            makeMove.makeMove(button7, tneNewButtonsList);
        });

        //button8
        button8.setOnMouseClicked(e -> {
            makeMove.makeMove(button8, tneNewButtonsList);
        });

        //button9
        button9.setOnMouseClicked(e -> {
            makeMove.makeMove(button9, tneNewButtonsList);
        });

        //guitButton
        buttonQuit.setOnAction(e -> {
            System.out.println("Quit App");
            primaryStage.close();
        });

        //newButton
        buttonNew.setOnAction(e -> {
            System.out.println("Restarting Game");
            primaryStage.close();
            Platform.runLater(() -> {
                try {
                    new TicTacToe2().start(new Stage());
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            });
        });


        //grid
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(button1, 0, 0);
        gridPane.add(button2, 0, 1);
        gridPane.add(button3, 0, 2);
        gridPane.add(button4, 1, 0);
        gridPane.add(button5, 1, 1);
        gridPane.add(button6, 1, 2);
        gridPane.add(button7, 2, 0);
        gridPane.add(button8, 2, 1);
        gridPane.add(button9, 2, 2);

        //quitGameButton and newGameButton
        gridPane.add(buttonQuit, 3, 4);
        gridPane.add(buttonNew, 4, 4);


        Scene scene = new Scene(gridPane, 300, 300, Color.BLACK);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}