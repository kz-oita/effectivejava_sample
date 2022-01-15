package item42;

public class LambdaSample {

	@FunctionalInterface
	interface Color{
		String write(String str);
	}
	public static void main(String[] args) {
		Color c1 = (String a) -> {return a + "です";};
		String b = c1.write("黄");
		System.out.println(b);
	}

}
