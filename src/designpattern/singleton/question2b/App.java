package designpattern.singleton.question2b;

public class App {

	public static void main(String[] args) {
		Triple a1 = Triple.getInstance("ALPHA");
		Triple a2 = Triple.getInstance("ALPHA");
		Triple b1 = Triple.getInstance("BETA");
		Triple b2 = Triple.getInstance("BETA");
		Triple c1 = Triple.getInstance("GAMMA");
		Triple c2 = Triple.getInstance("GAMMA");

		if (a1 == a2) {
			System.out.println(a1);
		} else {
			System.out.println("a1 != a2");
		}

		if (b1 == b2) {
			System.out.println(b1);
		} else {
			System.out.println("b1 != b2");
		}

		if (c1 == c2) {
			System.out.println(c1);
		} else {
			System.out.println("c1 != c2");
		}
	}

}
