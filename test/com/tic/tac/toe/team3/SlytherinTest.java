package com.tic.tac.toe.team3;

import junit.framework.TestCase;

import java.awt.*;
import java.awt.event.ActionEvent;

public class SlytherinTest extends TestCase {
        Slytherin slytherin = new Slytherin();

    public void testActionPerformed() {
        ActionEvent ActionEvent = null;
        slytherin.actionPerformed(null);
        assertTrue(true);
    }
}