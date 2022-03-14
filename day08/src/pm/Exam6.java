package pm;

class Animal {
	void cry() {

	}
}

class Bird extends Animal {
	void cry() {
		System.out.println("짹짹");
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}

public class Exam6 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Bird bird = new Bird();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		animal.cry();
		bird.cry(); // 짹짹
		cat.cry(); // 야옹
		dog.cry(); // 멍멍
		
		System.out.println();
		
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		bb.cry(); // 짹짹
		cc.cry(); // 야옹
		dd.cry(); // 멍멍
		
		System.out.println();
		
		Animal[] animals = {bb,cc,dd};
		
		for(Animal ani : animals) {
			ani.cry();
		}
	}

}
