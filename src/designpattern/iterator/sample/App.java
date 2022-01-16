package designpattern.iterator.sample;

import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.append(new Book("リーダブルコード"));
		bookShelf.append(new Book("Effective Java"));
		bookShelf.append(new Book("テスト駆動開発"));
		bookShelf.append(new Book("デザインパターン"));
		Iterator<Book> it = bookShelf.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
	}

}
