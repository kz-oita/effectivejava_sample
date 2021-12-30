package item34;

import item34.Product.ConditionCategory;
import item34.Product.ConditionRate;

public class App {

	public static final int COMMAND_ADD = 0;

	public static void main(String[] args) {

		int commandType = Integer.valueOf(args[0]);
		String name = args[1];
		int price = Integer.valueOf(args[2]);
		ConditionCategory conditionCategory = ConditionCategory.of(Integer.valueOf(args[3]));
		ConditionRate conditionRate = ConditionRate.of(Integer.valueOf(args[4]));

		if (commandType == COMMAND_ADD) {
			new AddAction().execute(name, price, conditionCategory, conditionRate);
		}

	}

}