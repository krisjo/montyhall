package montyhall;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MontyHallSimulatorTest {

	NonRandomIntegerGenerator nonRandomIntegerGenerator = new NonRandomIntegerGenerator();

	@Test
	public void switchStrategyShouldWin_test() {
		// Given
		final int moneyBoxNr = 0;
		nonRandomIntegerGenerator.setNextValue(moneyBoxNr);
		MontyHallGame montyHallGame = new MontyHallGame(nonRandomIntegerGenerator);
		final int choiceBoxNr = 1;
		nonRandomIntegerGenerator.setNextValue(choiceBoxNr);

		// When Then
		assertTrue("Choosing other than money box and switching should win", MontyHallSimulator.isSwitchSuccessful(montyHallGame));
	}

	@Test
	public void switchStrategyShouldLose_test() {
		// Given
		final int moneyBoxNr = 0;
		nonRandomIntegerGenerator.setNextValue(moneyBoxNr);
		MontyHallGame montyHallGame = new MontyHallGame(nonRandomIntegerGenerator);
		final int choiceBoxNr = 0;
		nonRandomIntegerGenerator.setNextValue(choiceBoxNr);

		// When Then
		assertFalse("Choosing money box and switching should lose", MontyHallSimulator.isSwitchSuccessful(montyHallGame));
	}

	@Test
	public void stayStrategyShouldBeWin_test() {
		// Given
		final int moneyBoxNr = 0;
		nonRandomIntegerGenerator.setNextValue(moneyBoxNr);
		MontyHallGame montyHallGame = new MontyHallGame(nonRandomIntegerGenerator);
		final int choiceBoxNr = 0;
		nonRandomIntegerGenerator.setNextValue(choiceBoxNr);

		// When Then
		assertTrue("Choosing other than money box and switching should win", MontyHallSimulator.isNonSwitchSuccessful(montyHallGame));
	}

	@Test
	public void stayStrategyShouldLose_test() {
		// Given
		final int moneyBoxNr = 0;
		nonRandomIntegerGenerator.setNextValue(moneyBoxNr);
		MontyHallGame montyHallGame = new MontyHallGame(nonRandomIntegerGenerator);
		final int choiceBoxNr = 1;
		nonRandomIntegerGenerator.setNextValue(choiceBoxNr);

		// When Then
		assertFalse("Choosing money box and switching should lose", MontyHallSimulator.isNonSwitchSuccessful(montyHallGame));
	}

}
