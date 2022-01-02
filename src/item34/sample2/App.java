package item34.sample2;

public class App {

	public static void main(String[] args) {
		int result1 = Calculator.calculate("plus", 5, 4);
		int result2 = Calculator.calculate("minus", 5, 4);
		int result3 = Calculator.calculate("times", 5, 4);
		int result4 = Calculator.calculate("divide", 5, 4);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
