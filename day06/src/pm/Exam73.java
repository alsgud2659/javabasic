package pm;

public class Exam73 {

	public static void main(String[] args) {
		// 명시적으로 this 키워드를 붙여야 하는 경우
		X x = new X();
		x.init(2, 3);
		System.out.println(x.m);
		System.out.println(x.n);
		Y y = new Y();
		y.init(2, 3);
		System.out.println(y.m);
		System.out.println(y.n);
	}

}

class X{
	int m;
	int n;
	void init(int m, int n) {
		m = m;
		n = n;
	}
}

class Y{
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;	//Y.m
		this.n = n; //Y.n
	}
}