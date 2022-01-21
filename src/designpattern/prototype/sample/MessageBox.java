package designpattern.prototype.sample;

import designpattern.prototype.sample.framework.Product;

public class MessageBox implements Product{
	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		int decolen = s.length() + 2;
		for (int i = 0; i < decolen; i++) {
			System.out.print(decochar);
		}
		System.out.println();
		System.out.println(decochar + s + decochar);
		for (int i = 0; i < decolen; i++) {
			System.out.print(decochar);
		}
		System.out.println();
	}

	@Override
	public Product createCopy() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
