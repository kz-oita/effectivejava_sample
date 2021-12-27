package item23;

public class FigureTagSample {

	enum Shape { RECTANGLE, CIRCLE };

	final Shape shape;

	//RECTANGLEの場合使われるフィールド
	double length;
	double width;
	//CIRCLEの場合使われるフィールド
	double radius;

	//長方形のコンストラクタ
	FigureTagSample(double length, double width){
		shape = Shape.RECTANGLE;
		this.length = length;
		this.width = width;
	}

	//円のコンストラクタ
	FigureTagSample(double radius){
		shape = Shape.CIRCLE;
		this.radius = radius;
	}

	double area() {
		switch (shape) {
		case RECTANGLE:
			return length * width;
		case CIRCLE:
			return Math.PI * (radius * radius);
		default:
			throw new AssertionError(shape);
		}
	}
}
