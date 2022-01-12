package item29and30;


public class GenericsMethod {

	public static void main(String[] args) {
		String string = getT("Hello");
		System.out.println(string);


		int i = getT(1);
		System.out.println(i);
	}

	private static <T> T getT(T t) {
		return t;
	}

}
