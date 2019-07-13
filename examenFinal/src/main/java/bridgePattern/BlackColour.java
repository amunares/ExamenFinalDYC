package bridgePattern;

public class BlackColour implements Colour {

	@Override
	public String applyColor(String element) {
		System.out.println("El "+ element+" es negro");
		return null;
	}

}
