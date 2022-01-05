package item55;

import java.util.Optional;

public class OptionalSample {

	public static void main(String[] args) {
		Optional<OptionalSample> opt = getSample();
		opt.ifPresentOrElse(v -> System.out.println(v.hello()), () -> System.out.println("nullでーす"));
	}

	static Optional<OptionalSample> getSample() {
		OptionalSample sample = null;

		if (new java.util.Random().nextBoolean()) {
			sample = new OptionalSample();
		}

		return Optional.ofNullable(sample);
	}

	String hello() {
		return "Hello, World.";
	}
}
//https://www.bold.ne.jp/engineer-club/java-optional
