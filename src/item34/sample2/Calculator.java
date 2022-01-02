package item34.sample2;

public class Calculator {

	public static int calculate(String commandStr, int x, int y) {


		Command command = Command.valueOf(commandStr.toUpperCase());

		return command.execute(x,y);
	}
}
