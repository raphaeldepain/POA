package fr.p10.miage.rps.model;

import org.testng.annotations.*;

import static fr.p10.miage.rps.model.RPSEnum.PAPER;
import static fr.p10.miage.rps.model.RPSEnum.ROCK;
import static fr.p10.miage.rps.model.RPSEnum.SCISSORS;
import static fr.p10.miage.rps.model.Result.LOST;
import static fr.p10.miage.rps.model.Result.TIE;
import static fr.p10.miage.rps.model.Result.WIN;
import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    RockPaperScissors rps;
    @DataProvider(name = "winData")
    public Object[][] createWinData() {
        return new Object[][] {
                { PAPER, ROCK},
                { ROCK, SCISSORS},
                { SCISSORS, PAPER},
        };
    }

    @DataProvider(name = "lostData")
    public Object[][] createLostData() {
        return new Object[][] {
                { PAPER, SCISSORS},
                { ROCK, PAPER},
                { SCISSORS, ROCK},

        };
    }

    @DataProvider(name = "tieData")
    public Object[][] createTieData() {
        return new Object[][] {
                { PAPER, PAPER},
                { ROCK, ROCK},
                { SCISSORS, SCISSORS},

        };
    }

    @BeforeMethod
    public void setUp() {
      rps  = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() {
        rps = null;

    }


    @Test(dataProvider = "winData")
    public void testWinPlay( RPSEnum p1 , RPSEnum p2) {
        assertEquals(rps.play(p1,p2), WIN);
    }

    @Test(dataProvider = "lostData")
    public void testLostPlay( RPSEnum p1 , RPSEnum p2) {
        assertEquals(rps.play(p1,p2), LOST);
    }

    @Test(dataProvider = "tieData")
    public void testTiePlay( RPSEnum p1 , RPSEnum p2) {
        assertEquals(rps.play(p1,p2), TIE);
    }


}