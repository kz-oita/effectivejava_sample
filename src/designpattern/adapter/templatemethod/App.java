package designpattern.adapter.templatemethod;

public class App {

	public static void main(String[] args) {

		AbstractDisplay d1 = new CharDisplay('X');

		AbstractDisplay d2 = new StringDisplay("Hello, World!!");

		d1.display();
		d2.display();
	}

}
