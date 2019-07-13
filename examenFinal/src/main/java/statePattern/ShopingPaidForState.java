package statePattern;

public class ShopingPaidForState extends State {

	private Shoping shoping;
	
	public ShopingPaidForState(Shoping shoping) {
		this.shoping = shoping;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Turning shoping on to add.");
		shoping.setState(shoping.getShopingAddState());
	}
	
	public String toString() {
		return "Shoping is paid for.";
	}
}