package pm;

public class MyCalTest {

	public static void main(String[] args) {
		Calculator cal = new Mycalc();
		int j = cal.plus(3, 4);
		System.out.println(j);
		int i = cal.exec(5, 6);
		System.out.println(i);
		int k = Calculator.exec2(3, 4);
		System.out.println(k);
		

	}

}
