package item58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample2 {

	public static void main(String[] args) {
		//java.util.ConcurrentModificationException

		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 9));

		for (Integer element: numbers) {
            if(element % 2 == 0) numbers.remove(element);
       }

		for (Integer element: numbers) {
			System.out.println(element);
       }

	}

}
