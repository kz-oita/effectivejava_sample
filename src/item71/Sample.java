package item71;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List<String> values = new ArrayList<>();
		values.add("one");
		values.add("two");  // exception thrown
		values.add("three");

		String two = values.stream().filter(s -> s.equals("two")).findAny().orElseThrow(() -> new RuntimeException("not found"));

		System.out.println(two);
	}

}
