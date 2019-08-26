
public class DuckDriver {

	public static void main(String[] args) {
	    Duck mduck = new MallardDuck();
	    mduck.performFly();
	    mduck.performQuack();
	    mduck.swim();
	    mduck.display();
	    mduck.setFlyBehavior(new FlyWithRocket());
	    mduck.performFly();

	   
	    System.out.println("******************************************");
	    Duck sduck = new Myduck();
	    sduck.display();

	}
	
	
}
