package designpattern.prototype.sample.framework;

public interface Product extends Cloneable {
	public void use(String s);
	public Product createCopy();

}
