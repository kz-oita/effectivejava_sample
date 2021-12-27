package item24;

public class StaticMemberClassSample {

	private static final String STATIC_ENCKOSING_FIELD_STRING = "hoge";

	public static class MemerClass {

		private final String nesetedField;

		public MemerClass() {
			this.nesetedField =  STATIC_ENCKOSING_FIELD_STRING;
		}

	}

	public static void main(String[] args) {
		final StaticMemberClassSample.MemerClass memerClass = new StaticMemberClassSample.MemerClass();

		System.out.println(memerClass.nesetedField);
	}


}
