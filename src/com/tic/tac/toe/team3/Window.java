package com.tic.tac.toe.team3;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    Gryffindor gryffindor;
    Slytherin mySlytherin;


    Window() {

    }

    public void display(boolean check){
        //appears in the middle of the screen
        if(check){
            gryffindor = new Gryffindor();

          //  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.add(gryffindor);
        }
        else{
            mySlytherin = new Slytherin();
            //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.add(mySlytherin);
        }
        this.pack();
        this.setLocationRelativeTo(null);       //appears in the middle of the screen
        this.setVisible(true); // makes it Visible
    }
}

