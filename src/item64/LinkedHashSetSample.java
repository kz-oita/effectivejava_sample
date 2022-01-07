package item64;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetSample {

	public static void main(String[] args) {

		// LinkedHashSet
        Set<String> linkedHash = new LinkedHashSet<>();
        linkedHash.add("A");
        linkedHash.add("B");
        linkedHash.add("C");

     // HashSet
        Set<String> hash = new HashSet<>();
        hash.add("A");
        hash.add("B");
        hash.add("C");

     // ArrayList
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        // Collectionの追加
        linkedHash.addAll(list);
        hash.addAll(list);

        //[A, B, C, 1, 2, 3] 挿入した順序となる
        System.out.println(linkedHash);

        //[A, 1, B, 2, C, 3]
        System.out.println(hash);

	}

}
