package montyhall;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class MontyHallGameTest {
	MontyHallGame gameToTestRandomly = new MontyHallGame(new RandomIntegerGenerator());

	@Test
	public void moneyBoxConsistency_test() {
		assertTrue(gameToTestRandomly.isMoneyBox(gameToTestRandomly.getMoneyBoxNr()));
	}

	@Test
	public void shownBoxIsNotMoneyBox_test() {
		assertNotEquals(gameToTestRandomly.getNonMoneyBoxNrExcept(gameToTestRandomly.getMoneyBoxNr()), gameToTestRandomly.getMoneyBoxNr());
	}

	@Test
	public void shownBoxIsNotSpecifiedBox_test() {
		final BoxNr chosenBoxNr = new BoxNr((gameToTestRandomly.getMoneyBoxNr().nr + 1) % BoxNr.maxBoxNr);
		assertNotEquals(gameToTestRandomly.getNonMoneyBoxNrExcept(chosenBoxNr), chosenBoxNr);
	}

	final NonRandomIntegerGenerator nonRandomIntegerGenerator = new NonRandomIntegerGenerator();

	@Test
	public void expectedBoxShown_test() {
		// Given
		final int moneyBoxNr = 0;
		nonRandomIntegerGenerator.setNextValue(moneyBoxNr);
		final BoxNr chosenBox = new BoxNr(1);

		// When
		MontyHallGame gameToTestNonRandom = new MontyHallGame(nonRandomIntegerGenerator);
		BoxNr showBox = gameToTestNonRandom.getNonMoneyBoxNrExcept(chosenBox);

		//Then
		assertEquals("Show box when money box is 0 and chosen box is 1", 2, showBox.nr);
	}

}
