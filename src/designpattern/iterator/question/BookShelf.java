package designpattern.iterator.question;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {

	private List<Book> books;

	public BookShelf(int maxSize) {
		this.books = new ArrayList<Book>();
	}

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public void append(Book book) {
		books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	@Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

}