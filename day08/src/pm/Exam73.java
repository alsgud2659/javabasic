package pm;

class superA{
	superA() {
		System.out.println("A생성자");
	}
}

class superB extends superA {
	superB() {
		super(); //생략하면 자바가 자동으로 만들어준다. 
		System.out.println("B생성자");
	}
}

class superC {
	superC(int a){
		System.out.println("C생성자");
		
	}
}

class superD extends superC {
	/*
	 * 자바가 자동으로 추가
	 * superD() {
	 * 	super();
	 * }
	 */
	superD() {
		super(3);
	}
}

public class Exam73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superA sa = new superA();
		System.out.println();
		
		superB sb = new superB();
	}

}

