package montyhall;

public class MontyHallSimulator {

	public static boolean isSwitchSuccessful(MontyHallGame montyHallGame) {
		BoxNr chosenBoxNr = montyHallGame.getRandomBoxNr();
		BoxNr shownNonMoneyBoxNr = montyHallGame.getNonMoneyBoxNrExcept(chosenBoxNr);
		final BoxNr switchToBoxNr = montyHallGame.getOtherBoxNr(chosenBoxNr, shownNonMoneyBoxNr);
		final boolean resultIsMoney = montyHallGame.isMoneyBox(switchToBoxNr);

		System.out.printf(
			"Switch: money %s, chosen %s, shown %s, switched to %s, win %b%n",
			montyHallGame.getMoneyBoxNr(), chosenBoxNr, shownNonMoneyBoxNr, switchToBoxNr, resultIsMoney);

		return resultIsMoney;
	}

	public static boolean isNonSwitchSuccessful(MontyHallGame montyHallGame) {
		BoxNr chosenBoxNr = montyHallGame.getRandomBoxNr();
		BoxNr shownNonMoneyBoxNr = montyHallGame.getNonMoneyBoxNrExcept(chosenBoxNr);
		final boolean resultIsMoney = montyHallGame.isMoneyBox(chosenBoxNr);

		System.out.printf(
			"Non-Switch: money %s, chosen %s, shown %s, win %b%n",
			montyHallGame.getMoneyBoxNr(), chosenBoxNr, shownNonMoneyBoxNr, resultIsMoney);

		return resultIsMoney;
	}

}
