package pm;

public class Exam41 {

	public static void main(String[] args) {
		B b = new B();
		
		b.printFieldValue();

	}

}

class B {
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() {
		System.out.println(m1); // 필드는 초기화 하지 않아도 값이 강제 초기화
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	
	void printLocalValue() {
		int k;
		//System.out.println(k); // 지역변수를 초기화를 하지 않으면 에러가 발생한다.
		
	}
}