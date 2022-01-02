package item34.sample1;

import item34.sample1.Product.ConditionCategory;
import item34.sample1.Product.ConditionRate;

public class AddAction {

	public void execute(String name, int price, ConditionCategory conditionCategory, ConditionRate conditionRate) {

		Product product = new Product(Product.DEFAULT_ID, name, price, conditionCategory, conditionRate);
		new ProductDao().insert(product);

	}

}
