package bridgePattern;

public class BlueColour implements Colour {

	@Override
	public String applyColor(String element) {
		System.out.println("El "+ element+" es azul");
		return null;
	}

}
