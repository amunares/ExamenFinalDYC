package statePattern;


public class ShopingRemoveState extends State {

	private Shoping shoping;
	
	public ShopingRemoveState(Shoping shoping) {
		this.shoping = shoping;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Turning shoping on to checkout.");
		shoping.setState(shoping.getShopingCheckoutState());
	}
	
	public String toString() {
		return "Shoping is remove.";
	}
}