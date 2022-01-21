package designpattern.prototype.sample;

import designpattern.prototype.sample.framework.Product;

public class UnderLinePen implements Product {

	private char ulchar;

	public UnderLinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public void use(String s) {
		System.out.println(s);
		for (int i = 0; i < s.length(); i++) {
			System.out.print(ulchar);
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
