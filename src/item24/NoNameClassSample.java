package item24;

public class NoNameClassSample {

	public interface NoNameClassBase{
		String getParam();
	}
	public static void main(String[] args) {
		final NoNameClassBase nncb = new NoNameClassBase() {
			@Override
			public String getParam() {
				return "hoge";
			}
		};
		System.out.println(nncb.getParam());
	}

}
