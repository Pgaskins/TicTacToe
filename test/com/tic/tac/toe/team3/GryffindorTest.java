package com.tic.tac.toe.team3;

import junit.framework.TestCase;

import java.awt.event.ActionEvent;

public class GryffindorTest extends TestCase {

    Gryffindor griff = new Gryffindor();
    public void testActionPerformed() {
        ActionEvent ActionEvent = null;
        griff.actionPerformed(null);
        assertTrue(true);
    }
}