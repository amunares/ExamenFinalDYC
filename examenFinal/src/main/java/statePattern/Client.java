package statePattern;

public class Client {

	public static void main(String[] args) {
		Shoping shoping = new Shoping();
		System.out.println(shoping);
		shoping.pullChain();
		System.out.println(shoping);
		shoping.pullChain();
		System.out.println(shoping);
		shoping.pullChain();
		System.out.println(shoping);
		shoping.pullChain();
		System.out.println(shoping);
	}
}
