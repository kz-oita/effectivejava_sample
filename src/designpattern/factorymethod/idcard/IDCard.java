package designpattern.factorymethod.idcard;

import designpattern.factorymethod.framework.Product;

public class IDCard extends Product{
	private String owner;

	IDCard(String owner) {
		System.out.println(owner + "のカードを作成");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(this + "を使用");
	}

	@Override
	public String toString() {
		return "IDCard:" + owner + "]";
	}

	public String getOnwer() {
		return owner;
	}

}
