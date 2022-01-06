package item58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Sample3 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 9));

		for(Iterator<Integer> it = numbers.iterator();it.hasNext();) {
			int i = it.next();
			if(i % 2 == 0) it.remove();
		}
//		numbers.removeIf(n -> (n % 2 == 0));
//		https://codechacha.com/ja/java-collections-arraylist-removeif/

		//1,9
		for (Integer element: numbers) {
			System.out.println(element);
       }

	}
}
