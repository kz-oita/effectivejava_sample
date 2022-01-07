package item01;

public class Config {

	private static Config config = new Config();

	private Config() {
		System.out.println("インスタンスを生成");
	}

	public static Config getInstance() {
		return config;
	}
}
