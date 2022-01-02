package item34.sample3;

public enum Command {

	PLUS("+") {
		@Override
		public double execute(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		@Override
		public double execute(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		@Override
		public double execute(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		@Override
		public double execute(double x, double y) {
			return x / y;
		}
	};

	private final String synbol;

	private Command(String synbol) {
		this.synbol = synbol;
	}

	public String getSynbol() {
		return synbol;
	}

	public abstract double execute(double x, double y);
}
