package statePattern;



public class ShopingCheckoutState extends State {

	private Shoping shoping;
	
	public ShopingCheckoutState(Shoping shoping) {
		this.shoping = shoping;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Turning shoping on to paid for.");
		shoping.setState(shoping.getShopingPaidForState());
	}
	
	public String toString() {
		return "Shoping is checkout.";
	}
}