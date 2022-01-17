package designpattern.adapter.question;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		FileIo f = new Fileproperties();
		try {
			f.readFromFile("file.txt");
			f.setValue("width", "1024");
			f.setValue("height", "512");
			f.setValue("depth", "32");
			f.writeToFile("newfile.txt");
			System.out.println("newfile.txt is created");

		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
