package com.tic.tac.toe.team3;

import com.tic.tac.toe.team3.TicTacToe;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class TicTacToeCLI {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        JFrame window = new JFrame("EAST WEST CONNECT TLG LEARNING ");
        //window.setIconImage();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new TicTacToe()); // adds the data
        window.setBounds(300,300,300,300); // area of Board 4X4
        window.setVisible(true); // show the gameBoard
        window.setLocationRelativeTo(null); // center of the TV Screen

        File song = new File("resources/harrypotter.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(song);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);

    }
}
