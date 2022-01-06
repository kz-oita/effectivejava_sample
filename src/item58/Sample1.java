package item58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 9));

		for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i) % 2 == 0) numbers.remove(i);
        }

		// 偶数の値が削除されない
		for(int i=0; i<numbers.size(); i++){
			System.out.println(numbers.get(i));
        }

	}
//https://yuukiyg.hatenablog.jp/entry/2013/10/30/093500
}
