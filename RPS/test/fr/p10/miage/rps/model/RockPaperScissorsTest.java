package fr.p10.miage.rps.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static fr.p10.miage.rps.model.RPSEnum.PAPER;
import static fr.p10.miage.rps.model.RPSEnum.ROCK;
import static fr.p10.miage.rps.model.Result.LOST;
import static fr.p10.miage.rps.model.Result.WIN;
import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    RockPaperScissors rps;

    @BeforeMethod
    public void setUp() {
      rps  = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() {
        rps = null;

    }

    @Parameters({"paper","rock"})
    @Test
    public void testWinPlay(String p1, String p2) {
        assertEquals(rps.play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)), WIN);
    }
}