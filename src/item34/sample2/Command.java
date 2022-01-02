package item34.sample2;


public enum Command {


	PLUS {
		@Override
		public int execute(int x, int y) {
			return x + y;
		}
	},
	MINUS{
		@Override
		public int execute(int x, int y) {
			return x - y;
		}

	},
	TIMES{
		@Override
		public int execute(int x, int y) {
			return x * y;
		}
	},
	DIVIDE{
		@Override
		public int execute(int x, int y) {
			return x / y;
		}
	};

	public abstract int execute(int x, int y);
}
