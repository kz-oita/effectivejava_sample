package item43;

import java.util.function.Function;
import java.util.function.Supplier;

public class App1 {

	public static void main(String[] args) {
		Color c1 = new Color();
		//インスタンスの変数::メソッド名
		Function<String, String>  color = c1::getName;
//		Function<String, String> color = a -> a + "です";

		//クラス名::メソッド名
		Supplier<String> c2 = Color::getName2;

		//クラス名::new
		Supplier<Color> c3 = Color::new;


		System.out.println(color.apply("red"));
		System.out.println(c2.get());
		System.out.println(c3.get().getName("blue"));
	}


}
