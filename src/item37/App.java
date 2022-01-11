package item37;

public class App {

	public static void main(String[] args) {
		for (Month m : Month.values()) {
			System.out.println(String.format("%sの略は%s", m, Month.toStr(m)));

//			Januaryの略はJan.
//			Feburaryの略はFeb.
//			(略)
		}
	}
}
