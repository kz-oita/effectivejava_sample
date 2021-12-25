package item18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
        InstrumentedHashSetExtendsPattern<String> set = new InstrumentedHashSetExtendsPattern<String>();
        set.addAll(Arrays.asList("AAA", "BBB", "CCC"));

        System.out.println(set.size()); //→3
        System.out.println(set.getAddCount()); //→6


        Set<String> hashSet = new HashSet<String>();
        InstrumentedHashSetCompositionPattern<String> set2 = new InstrumentedHashSetCompositionPattern<String>(hashSet);
        set2.addAll(Arrays.asList("AAA", "BBB", "CCC"));
        System.out.println(set2.size()); //→3
        System.out.println(set2.getAddCount()); //→3
	}
}
