package item44;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		//引数はInteger、戻り値がString
		Function <Integer, String> c1 = a -> "テスト" + a + "です";
		String str = c1.apply(100);
		System.out.println(str);

		//引数はInteger
		Consumer <Integer> c2 = a -> System.out.println(a + "です");
		c2.accept(200);

		//引数はString、戻り値がboolean
		Predicate <String> c3 = a -> a.isEmpty();
		System.out.println(c3.test("800"));
		System.out.println(c3.test(""));


	}
}
