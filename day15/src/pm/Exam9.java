package pm;

public class Exam9 {

	public static void main(String[] args) {
		A a1 = new A();
		B b1 = (B)a1;
		C c1 = (C)a1;
		D d1 = (D)a1;
		E e1 = (E)a1;

	}

}

class A {}
class B extends A{}
class C extends B{}
class D extends B{}
class E extends B{}