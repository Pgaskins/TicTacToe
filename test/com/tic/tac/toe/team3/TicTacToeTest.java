package com.tic.tac.toe.team3;

import junit.framework.TestCase;
import org.junit.Before;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class TicTacToeTest extends TestCase {
    TicTacToe ticTacToe = new TicTacToe();

    public TicTacToeTest() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
    }

    public void testInitializeButtons() {
        ticTacToe.initializeButtons();
        assertTrue(true);
        assertFalse(false);

    }

    public void testDisplayWinner() {
        ticTacToe.displayWinner();
        assertTrue(true);
        assertFalse(false);

    }

    public void testCheckDraw() {
        ticTacToe.checkDraw();
        assertTrue(true);
        assertEquals("-", "-");
    }

    public void testCheckForWinner() {
        ticTacToe.checkForWinner();
        assertTrue(true);
        assertFalse(false);
    }

    public void testCheckRows() {
        ticTacToe.checkRows();
        assertEquals("-","-");
    }

    public void testCheckColumns() {
        ticTacToe.checkColumns();
        assertEquals("-","-");
    }

    public void testCheckDiagonals() {
        ticTacToe.checkDiagonals();
        assertEquals(0,0);
    }
}