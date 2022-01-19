package designpattern.factorymethod;

import designpattern.factorymethod.framework.Factory;
import designpattern.factorymethod.framework.Product;
import designpattern.factorymethod.idcard.IDCardFactory;

public class App {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Tanaka");
		Product card2 = factory.create("Sato");
		Product card3 = factory.create("Ito");
		card1.use();
		card2.use();
		card3.use();
	}

}
