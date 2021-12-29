package item29and30;

public class GenericsClassSample2 <T> {

	private T t;

	public GenericsClassSample2(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

}
