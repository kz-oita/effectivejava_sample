package item01;

public class Major {

	private Integer num = 0;

	private Major(Integer num) {
		this.num = num;
	}

	public static Major valueOf(Integer num) {
		return new Major(num);

	}

	public Integer getNum() {
		return num;
	}




}
