package designpattern.adapter.delegatespattern;

public class App {

	public static void main(String[] args) {
		Print p = new PrintBanner("Hello World");
		p.printWeak();
		p.printStrong();
	}

}
