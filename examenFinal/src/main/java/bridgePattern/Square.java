package bridgePattern;

public class Square extends Shape {

	public Square(Colour colour) {
		super(colour);
	}

	@Override
	public void pintar() {
		colour.applyColor("Cuadrado");
	}

}
