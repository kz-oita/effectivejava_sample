package item10;

public class BookBadSample {
	private long id;
	private String title;
	private String author;
	private int price;


	public long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthorString() {
		return author;
	}


	public int getPrice() {
		return price;
	}


	public BookBadSample(long id, String title, String author, int price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	//equals を実装しない
}
