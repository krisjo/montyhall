package montyhall;

class NonRandomIntegerGenerator extends RandomIntegerGenerator {
	private int nextValue = 0;

	@Override
	public int getRandomNumber0To(int max) {
		return nextValue;
	}

	void setNextValue(int value) {
		nextValue = value;
	}
}
