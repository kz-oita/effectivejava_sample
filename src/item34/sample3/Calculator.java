package item34.sample3;

public class Calculator {

	public static final String FORMAT_FORMULA = "%.1f %s %.1f = %.1f";;

	public static String createFomulaWithAnswer(String commandStr, double x, double y) {

		 Command command = Command.valueOf(commandStr.toUpperCase());
		 return String.format(FORMAT_FORMULA, x, command.getSynbol(), y, command.execute(x,y));
	}
}

