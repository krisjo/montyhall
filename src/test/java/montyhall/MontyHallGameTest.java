package montyhall;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import javax.swing.*;

public class MontyHallGameTest
{
    MontyHallGame gameToTest = new MontyHallGame();

    @Test
    public void moneyBoxConsistency_test()
    {
        assertTrue(gameToTest.isMoneyBox(gameToTest.getMoneyBoxNr()));
    }

    @Test
    public void shownBoxIsNotMoneyBox_test()
    {
        assertNotEquals(gameToTest.getNonMoneyBoxNrExcept(gameToTest.getMoneyBoxNr()), gameToTest.getMoneyBoxNr());
    }

    @Test
    public void shownBoxIsNotSpecifiedBox_test()
    {
        final BoxNr chosenBoxNr = new BoxNr((gameToTest.getMoneyBoxNr().nr + 1) % BoxNr.maxBoxNr);
        assertNotEquals(gameToTest.getNonMoneyBoxNrExcept(chosenBoxNr), chosenBoxNr);
    }
}
