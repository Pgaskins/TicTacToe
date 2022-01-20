package com.tic.tac.toe.team3;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class BackgroundMusic {

    public void audioFile() {


        try {
            File song = new File("resources/harrypotter.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(song);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.flush();

        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
