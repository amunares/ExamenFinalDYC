package statePattern;

	public class ShopingAddState extends State {

		private Shoping shoping;
		
		public ShopingAddState(Shoping shoping) {
			this.shoping = shoping;
		}
		
		@Override
		public void handleRequest() {
			System.out.println("Turning shoping on to remove.");
			shoping.setState(shoping.getShopingRemoveState());
		}
		
		public String toString() {
			return "Shoping is add.";
		}
	}



