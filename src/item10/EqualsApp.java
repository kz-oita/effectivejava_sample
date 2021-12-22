package item10;

public class EqualsApp {

	public static void main(String[] args) {
		BookBadSample badSample1 = new BookBadSample(1, "BadBook", "BadAutor", 1000);
		BookBadSample badSample2 = new BookBadSample(1, "BadBook", "BadAutor", 1000);
		System.out.println(badSample1 == badSample2); //false
		System.out.println(badSample1.equals(badSample2)); //false


		BookGoodSample goodSample1 = new BookGoodSample(2, "GoodBook", "GoodAutor", 2000);
		BookGoodSample goodSample2 = new BookGoodSample(2, "GoodBook", "GoodAutor", 2000);
		System.out.println(goodSample1 == goodSample2); //false
		//equalsが実装されているためフィールドが等しいか検証される
		System.out.println(goodSample1.equals(goodSample2)); //true
	}
}
