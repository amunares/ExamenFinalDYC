package bridgePattern;

public class Circle extends Shape {

	public Circle(Colour colour) {
		super(colour);
	}

	@Override
	public void pintar() {
		colour.applyColor("círculo");
	}

}
