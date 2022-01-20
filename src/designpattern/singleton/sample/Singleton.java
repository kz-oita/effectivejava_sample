package designpattern.singleton.sample;

public class Singleton {
	private static Singleton single = new Singleton();

	private Singleton() {
		System.out.println("インスタンスを作成");
	}

	public static Singleton getInstance() {
		return single;
	}

}
