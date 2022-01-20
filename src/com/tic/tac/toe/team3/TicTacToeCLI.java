package com.tic.tac.toe.team3;

import com.tic.tac.toe.team3.TicTacToe;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class TicTacToeCLI {
    public static void main(String[] args)  {



        JFrame window = new JFrame("EAST WEST CONNECT TLG LEARNING ");//Provides the frame with a Title and reference(window)
        window.setIconImage(new ImageIcon("resources/origin.png").getImage());//
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            window.getContentPane().add(new TicTacToe()); // adds the content of the TicTacTOe Class to the JFrame
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
        window.setBounds(500,500,500,500); // area of Board 4X4
        window.setVisible(true); // shows the gameBoard
        window.setLocationRelativeTo(null); // center of the Monitor




    }
}
