package statePattern;



public class Shoping {
	State shopingAddState;
	State shopingRemoveState;
	State shopingCheckoutState;
	State shopingPaidForState;

	State state;

	public Shoping() {
		
		shopingAddState = new ShopingAddState(this);
		shopingRemoveState = new ShopingRemoveState(this);
		shopingCheckoutState = new ShopingCheckoutState(this);
		shopingPaidForState = new ShopingPaidForState(this);
		
		
	
		state = shopingAddState;
	}

	public void pullChain() {
		state.handleRequest();
	}

	public String toString() {
		return state.toString();
	}

	public State getShopingAddState() {
		return shopingAddState;
	}

	public State getShopingRemoveState() {
		return shopingRemoveState;
	}
	public State getShopingCheckoutState() {
		return shopingCheckoutState;
	}
	
	public State getShopingPaidForState() {
		return shopingPaidForState;
	}


	public void setState(State state) {
		this.state = state;
	}
}