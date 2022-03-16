package pm;

interface Predator{
	String getFood();
	
	default void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
	
	int LEG_COUNT = 4;
	static int speed() {
		return LEG_COUNT * 30;
	}
}

class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator{
	public String getFood() {
		return "apple";
	}
}
class Lion extends Animal implements Predator{
	public String getFood() {
		return "banana";
	}
}
class Crocodile extends Animal implements Predator{
	public String getFood() {
		return "strawberry";
	}
}
class Leopard extends Animal implements Predator{
	public String getFood() {
		return "orange";
	}
}
class ZooKeeper{
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
//	void feed(Predator tiger) {
//		System.out.println("feed apple");
//	}
//	void feed(Predator lion) {
//		System.out.println("feed banana");
//	}
//	void feed(Predator crocodile) {
//		System.out.println("feed strawberry");
//	}
//	void feed(Predator leopard) {
//		System.out.println("feed orange");
//	}
}

class Bouncer{
	
}

public class Sample {

	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		
		

	}

}
