package com.tic.tac.toe.team3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Slytherin extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 500;        //size of the panel, will ultimately make a square
    final int PANEL_HEIGHT = 800;
    Image winner;
    Image background;
    Timer timer;
    int xVelocity = 2;      //how many pixels this image is moving on the x-axis
    int yVelocity = 1;      //how many pixels this image is moving in the y-axis
    int x = 0;              //setting x position
    int y = 0;              //setting y position

    Slytherin(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        winner = new ImageIcon("resources/snitch.png").getImage();        //method-chain to make an image out of an imageicon
        background = new ImageIcon("resources/DailyProphetD.png").getImage();
        timer = new Timer(10, this );     //1000 ms = 1 s
    }

    public void paint(Graphics g){
        super.paint(g);     //paints background
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(background, 0, 0, null);
        g2D.drawImage(winner, x, y, null);
        timer.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH- winner.getWidth(null) || x < 0){
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;

        if(y >= PANEL_HEIGHT- winner.getHeight(null) || y < 0){
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();
    }
}