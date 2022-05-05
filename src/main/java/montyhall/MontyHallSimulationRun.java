package montyhall;

public class MontyHallSimulationRun {

	private static final int defaultNrofExecutions = 10;

	public static void main(String[] args) {
		int nrofExecutions = getNrofExecutions(args);

		if (nrofExecutions > 0) {
			System.out.printf("Simulating the Monty Hall problem %d times%n", nrofExecutions);

			int switchSuccesses = 0;
			int nonSwitchSuccesses = 0;
			RandomIntegerGenerator randomIntegerGenerator = new RandomIntegerGenerator();

			for (int executionNr = 0; executionNr < nrofExecutions; executionNr++) {
				MontyHallGame montyHallGame = new MontyHallGame(randomIntegerGenerator);
				if (MontyHallSimulator.isSwitchSuccessful(montyHallGame)) {
					switchSuccesses++;
				}
			}
			for (int executionNr = 0; executionNr < nrofExecutions; executionNr++) {
				MontyHallGame montyHallGame = new MontyHallGame(randomIntegerGenerator);
				if (MontyHallSimulator.isNonSwitchSuccessful(montyHallGame)) {
					nonSwitchSuccesses++;
				}
			}

			System.out.printf("Result: Of %d executions %d switches succeeded and %d non-switches succeeded%n", nrofExecutions, switchSuccesses, nonSwitchSuccesses);

		} else {
			System.out.printf("Usage: %s [number_of_executions]", MontyHallSimulationRun.class.getName());
		}
	}

	private static int getNrofExecutions(String[] args) {

		if (args.length == 0) {
			return defaultNrofExecutions;
		}

		if (args.length == 1) {
			try {
				return Integer.parseInt(args[0]);
			} catch (Exception e) {
				System.out.println("Invalid number");
				return 0;
			}
		}

		return 0;
	}
}
