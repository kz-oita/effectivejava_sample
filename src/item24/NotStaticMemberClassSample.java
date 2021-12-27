package item24;

public class NotStaticMemberClassSample {

	private String enclosingField;

	public NotStaticMemberClassSample(String enclosingField) {
		this.enclosingField = enclosingField;
	}

	public class MemberClass {
		private String innnerField;

		public MemberClass() {
			this.innnerField = NotStaticMemberClassSample.this.enclosingField;
		}

		public void setEnclosingField (String enclosingFiled) {
			NotStaticMemberClassSample.this.enclosingField = enclosingFiled;
		}

	}

	public static void main(String[] args) {
		final NotStaticMemberClassSample nsmClass = new NotStaticMemberClassSample("hoge");
		final NotStaticMemberClassSample.MemberClass memberClass = nsmClass.new MemberClass();
		memberClass.setEnclosingField("fuga");
		System.out.println(memberClass.innnerField);
		System.out.println(nsmClass.enclosingField);
	}

}
