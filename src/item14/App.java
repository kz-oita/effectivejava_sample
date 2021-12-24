package item14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {

		Car car1 = new Car(1, "NISSAN", "tanaka", 800);
		Car car2 = new Car(2, "HONDA", "saitou", 700);
		Car car3 = new Car(3, "NISSAN", "ito", 900);
		Car car4 = new Car(4, "SUZUKI", "nakata", 870);
		Car car5 = new Car(5, "SUZUKI", "yoshida", 680);


		List<Car> carList = new ArrayList<Car>();
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		carList.add(car5);

		Collections.sort(carList);
		for (Car car : carList) {
			System.out.println(car);
		}


//		Car [id=2, carKind=HONDA, owner=saitou, price=700]
//		Car [id=3, carKind=NISSAN, owner=ito, price=900]
//		Car [id=1, carKind=NISSAN, owner=tanaka, price=800]
//		Car [id=4, carKind=SUZUKI, owner=nakata, price=870]
//		Car [id=5, carKind=SUZUKI, owner=yoshida, price=680]
	}

}
