package item12;

public class Student {

		int studentNo;
		String name;
		int age;

		public Student(int studentNo, String name, int age) {
			this.studentNo = studentNo;
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Student [studentNo=" + studentNo + ", name=" + name + ", age=" + age + "]";
		}
}
