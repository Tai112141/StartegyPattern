
public class Myduck extends Duck {
	public Myduck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	@Override
	public void display() {
		System.out.println("My Duck it's cutie !!!!! ");
	}


}
