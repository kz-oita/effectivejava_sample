package item42;

public class AnonymousSample {

	@FunctionalInterface
	interface Color1 {
		String write1(String a);
	}

	public static void main(String[] args) {
		Color1 color1 = new Color1() {
			@Override
			public String write1(String a) {
				return a + "です";
			}
		};
		String b = color1.write1("緑");
		System.out.println(b);

	}

}
