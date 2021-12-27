package item24;

public class LocalClassSample {

	public static void main(String[] args) {
		class LocalClass {
			private final String field;

			public LocalClass(String field) {
				this.field = field;
			}
		}

		final LocalClass localClass = new LocalClass("hoge");
		System.out.println(localClass.field);
	}

}
