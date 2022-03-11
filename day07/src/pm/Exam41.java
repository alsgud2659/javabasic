package pm;

public class Exam41 {

	public static void main(String[] args) {
		C1 c = new C1();
		
		System.out.println(c.averageScore(1));
		System.out.println(c.averageScore(1,2));
		System.out.println(c.averageScore(1,2,3));
		System.out.println(c.averageScore(1,2,3,4));
	}

}

class C1{
	public static int averageScore(int ...a){
		int avg = 0;
		int sum = 0;
		for(int each : a) {
			sum += each;
		}
		avg = sum / a.length;
		
		return avg;
	}
}