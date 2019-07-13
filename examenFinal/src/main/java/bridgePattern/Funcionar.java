package bridgePattern;

public class Funcionar {

	public static void main(String[] args) {
		Colour colour = new RedColour();
		Circle circle = new Circle(colour);
		circle.pintar();
	}

}
