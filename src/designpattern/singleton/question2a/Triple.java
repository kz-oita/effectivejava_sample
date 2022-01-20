package designpattern.singleton.question2a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
	private static Map<String, Triple> map = new HashMap<String, Triple>();

	private String name;

	@Override
	public String toString() {
		return "Triple [name=" + name + "]";
	}

	static {
		String[] names = {"ALPHA", "BETA", "GAMMA"};
		Arrays.stream(names).forEach(s -> map.put(s, new Triple(s)));
	}

	private Triple(String name) {
		System.out.println("The instance " + name + " is created");
		this.name = name;
	}

	public static Triple getInstace(String name) {
		return map.get(name);
	}

}
