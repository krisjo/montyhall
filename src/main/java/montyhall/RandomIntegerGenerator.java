package montyhall;

public class RandomIntegerGenerator {
	public RandomIntegerGenerator() {
	}

	public int getRandomNumber0To(int max) {
		return (int) (Math.random() * (max + 1));
	}
}