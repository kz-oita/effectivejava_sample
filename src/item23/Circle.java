package item23;

public class Circle extends FigureExtendsSample{

	final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * (radius * radius);
	}

}
