package designpattern.singleton.sample;

public class App {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		if (singleton1 == singleton2) {
			System.out.println("同じインスタンスです");
		}else {
			System.out.println("同じインスタンスではありません");
		}
	}

}
