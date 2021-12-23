package item12;

public class App {
	public static void main(String[] args) {
		Student student = new Student(1, "tanaka taro", 12);

		//StudentクラスでtoStringをオーバーライドしない場合
		// → item12.Student@515f550a

		//StudentクラスでtoStringをオーバーライドする場合
		// → Student [studentNo=1, name=tanaka taro, age=12]
		System.out.println(student);
	}
}
