package other;

public class RefrenceSample {

	public static void main(String[] args) {
		int num = 10;
		tset1(num);
		System.out.println(num);
		//20
		//10



		String[] array =  {"Java", "JavaScript", "python"};
		test2(array);
		System.out.println(array[0]);
		//Ruby
		//Ruby



		String[] array2 =  {"Java", "JavaScript", "python"};
		test3(array);
		System.out.println(array2[0]);
		//Ruby
		//Java

	}

	private static void test3(String[] array) {
		array = new String[3];
		array[0] = "Ruby";
		System.out.println(array[0]);
	}

	private static void test2(String[] array) {
		array[0] = "Ruby";
		System.out.println(array[0]);

	}

	private static void tset1(int num) {
		num += 10;
		System.out.println(num);
	}

}
