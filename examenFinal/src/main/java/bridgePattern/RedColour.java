package bridgePattern;

public class RedColour implements Colour{

	@Override
	public String applyColor(String element) {
		System.out.println("El "+ element+" es rojo");
		return null;
	}
	
}
