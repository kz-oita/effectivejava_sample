package item02;

public class People {


	private String name;
	private Integer age;
	private String hobby;

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getHobby() {
		return hobby;
	}

	public static class Builder {
		private String name;
		private Integer age;
		private String hobby;

		public Builder(String name, Integer age) {
			this.name = name;
			this.age = age;
		}

		public Builder hobby(String hobby) {
			this.hobby = hobby;
			return this;
		}

		public People build() {
			if (name == null || age == null) {
				throw new NullPointerException();
			}
			return new People(this);

		}
	}

	private People(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.hobby = builder.hobby;
	}
}


	// new People.Builder("Taro", 15).hobby("BasketBall").build();}
    //https://qiita.com/disc99/items/840cf9936687f97a482b


