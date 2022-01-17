package designpattern.adapter.question;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Fileproperties implements FileIo{

	Properties property = new Properties();

	@Override
	public void readFromFile(String file) throws IOException {
		property.load(new FileReader(file));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		property.store(new FileWriter(filename), "written by FileProperties");
	}

	@Override
	public void setValue(String key, String value) throws IOException {
		property.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return property.getProperty(key);
	}

}
