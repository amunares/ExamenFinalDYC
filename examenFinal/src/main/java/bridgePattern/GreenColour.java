package bridgePattern;

public class GreenColour implements Colour {

	@Override
	public String applyColor(String element) {
		System.out.println("El "+ element+" es verde");
		return null;
	}

}
