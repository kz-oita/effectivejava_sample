package item37;

import java.util.EnumMap;

public enum Month {
	January,
	Feburary,
	March,
	April,
	May,
	June,
	July,
	Augusut,
	September,
	October,
	November,
	December;

	public final static EnumMap<Month, String> month = new EnumMap<Month, String>(Month.class);


	static{
		month.put(Month.January, "Jan.");
		month.put(Month.Feburary, "Feb.");
		month.put(Month.March, "Mar.");
		month.put(Month.April, "Apr.");
		month.put(Month.May, "May.");
		month.put(Month.June, "Jun.");
		month.put(Month.July, "Jul.");
		month.put(Month.Augusut, "Aug.");
		month.put(Month.September, "Sep.");
		month.put(Month.October, "Oct.");
		month.put(Month.November, "Nov.");
		month.put(Month.December, "Dec.");
	}

	public static String toStr(Month m) {
		return month.get(m);
	}
}
