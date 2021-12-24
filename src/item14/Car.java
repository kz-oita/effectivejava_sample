package item14;

public class Car implements Comparable<Car> {

	private long id;
	private String carKind;
	private String owner;
	private int price;

	public Car(long id, String carKind, String owner, int price) {
		this.id = id;
		this.carKind = carKind;
		this.owner = owner;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public String getCarKind() {
		return carKind;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", carKind=" + carKind + ", owner=" + owner + ", price=" + price + "]";
	}

	public String getOwner() {
		return owner;
	}

	public int getPrice() {
		return price;
	}


	public int compareTo(Car car) {
		int result = this.getCarKind().compareTo(car.getCarKind());
		if (result == 0) {
			return this.getOwner().compareTo(car.getOwner());
		}
		return result;
	}
}
