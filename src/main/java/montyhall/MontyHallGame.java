package montyhall;

public class MontyHallGame {
	private final BoxNr moneyBoxNr;

	public MontyHallGame() {
		moneyBoxNr = getRandomBoxNr();
	}

	public boolean isMoneyBox(BoxNr boxNr) {
		return boxNr.equals(moneyBoxNr);
	}

	public BoxNr getMoneyBoxNr() {
		return moneyBoxNr;
	}
	public BoxNr getNonMoneyBoxNrExcept(BoxNr chosenBoxNr) {
		return getOtherBoxNr(moneyBoxNr, chosenBoxNr);
	}

	public BoxNr getRandomBoxNr() {
		return new BoxNr(getRandomNumber0To(BoxNr.maxBoxNr));
	}

	public BoxNr getOtherBoxNr(BoxNr notThis, BoxNr notThisEither) {
		int freeBoxNr = 0;
		while (notThis.nr == freeBoxNr || notThisEither.nr == freeBoxNr) freeBoxNr++;

		if (freeBoxNr > BoxNr.maxBoxNr) throw new RuntimeException("Could not find free box in game");

		return new BoxNr(freeBoxNr);
	}

	private int getRandomNumber0To(int max) {
		return (int)(Math.random() * (max + 1));
	}
}
