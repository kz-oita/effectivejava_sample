package designpattern.singleton.question2a;

public class App {

	public static void main(String[] args) {
		Triple a1 = Triple.getInstace("ALPHA");
		Triple a2 = Triple.getInstace("ALPHA");
		Triple b1 = Triple.getInstace("BETA");
		Triple b2 = Triple.getInstace("BETA");
		Triple c1 = Triple.getInstace("GAMMA");
		Triple c2 = Triple.getInstace("GAMMA");

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
