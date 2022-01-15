package item42;

public class App {
	@FunctionalInterface
	interface Color {
		String write(String str);
	}

	public static void main(String[] args) {
		Color c1 = (a) -> {return a + "です";};
		System.out.println(c1.write("赤"));

		Color c2 = a -> a + "です";
		System.out.println(c2.write("青"));
	}

}
