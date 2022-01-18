package com.tic.tac.toe.team3;

import java.util.*;
import javax.swing.*;
import java.util.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
public class TicTacToe extends JPanel {

   private Character playerMark = 'x';
   private final JButton[] buttons = new JButton[9];

    //Ctor Set to init buttons and board with
    // 3 rows and 3 column at start
    public TicTacToe() {
        setLayout(new GridLayout(3, 3));//This is a method from the gridlayout class to set rows
        initializeButtons();


    }

    // a method used to create 9 buttons
    // set the text, add action listeners
    // and add them to the screen
    public void initializeButtons() {
        for (int i = 0; i <= 8; i++) {
            buttons[i] = new JButton();
            buttons[i].setText("-");
            buttons[i].setBackground(Color.GREEN);// part of the color class java.awt
            buttons[i].addActionListener(e -> {
                JButton buttonClicked = (JButton) e.getSource(); //Save the action of particular button that was clicked
                buttonClicked.setText(String.valueOf(playerMark)); // Sets the Player Mark


                if (playerMark == 'x') {
                    playerMark = 'o';
                    buttonClicked.setBackground(Color.CYAN);
                } else {
                    playerMark = 'x';
                    buttonClicked.setBackground(Color.ORANGE);
                }
                displayWinner();


            });

            add(buttons[i]); //adds this button to JPanel
        }
    }



    // Display the Winner

    public void displayWinner() {

        if(checkForWinner()) {
            // reverse the player marks
            // because after we put x and we win, the game changes it to o
            // but x is the winner
            if(playerMark == 'x') playerMark = 'O';
            else playerMark ='x';

            JOptionPane jPane = new JOptionPane();//The J action Pane that popup to ask if we want to play again
            int dialogResult = JOptionPane.showConfirmDialog(jPane, "Game Over. "+ playerMark + " Wins. Would you like to play again?","Game over.",
                    JOptionPane.YES_NO_OPTION);

            if(dialogResult == JOptionPane.YES_OPTION) resetTheButtons();
            else System.exit(0);
        }

        else if(checkDraw()) {
            JOptionPane pane = new JOptionPane();
            int dialogResult = JOptionPane.showConfirmDialog(pane, "Draw. Lets Play again?","Game over.", JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION)  resetTheButtons();
            else System.exit(0);
        }
    }



    // method used to reset the buttons
    // so you can play again
    private void resetTheButtons() {
        playerMark = 'x';
        for(int i =0;i<9;i++) {

            buttons[i].setText("-");
            buttons[i].setBackground(Color.white);

        }
    }

    // checks for draw

    public boolean checkDraw() {
        boolean full = true;
        for(int i = 0 ; i<9;i++) {
            if(buttons[i].getText().charAt(0) == '-') {// getText()to convert text to char
                full = false;
            }
        }
        return full;
    }

    // checks for a winner
    public boolean checkForWinner() {
        return checkRows() || checkColumns() || checkDiagonals();
    }

    // checks rows for a win
    public boolean checkRows() {
        int i = 0;
        for(int j = 0;j<3;j++) {//Checking each row to see if there is a winner/ 012,345,678
            if( buttons[i].getText().equals(buttons[i+1].getText()) && buttons[i].getText().equals(buttons[i+2].getText())
                    && buttons[i].getText().charAt(0) != '-') {//The key to make the game work
                return true;
            }
            i = i+3;

        }
        return false;
    }


    // checks columns for a win
    public boolean checkColumns() {// Iterate through each column 036,147,258

        int i = 0;
        for(int j = 0;j<3;j++) {
            if( buttons[i].getText().equals(buttons[i+3].getText()) && buttons[i].getText().equals(buttons[i+6].getText())
                    && buttons[i].getText().charAt(0) != '-')
            {
                return true;
            }
            i++;
        }
        return false;
    }

    // checks diagonals for a win
    public boolean checkDiagonals() {//Hard code the diags to see if there
        if(buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText())
                && buttons[0].getText().charAt(0) !='-')
            return true;
        else return buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText())
                && buttons[2].getText().charAt(0) != '-';
    }
}





