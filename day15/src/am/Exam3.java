package am;

public class Exam3 {
/*

 D d = new D();
 
 d.print();     //->입력값이 없습니다.
 d.print(3);    //->정수 입력값 : 3
 d.print(5.8);  //->실수 입력값 : 5.8
 d.print("안녕");//->문자열 입력값 : 안녕
 
 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 D d = new D();
//		 
//		 d.print();     //->입력값이 없습니다.
//		 d.print(3);    //->정수 입력값 : 3
//		 d.print(5.8);  //->실수 입력값 : 5.8
//		 d.print("안녕");//->문자열 입력값 : 안녕
		
		F f = new F();
		
		int[] data1 = new int[] {1,2,3};
		int[] data2 = {1,2,3};
		
		System.out.println(f.arraySum(data1));
		System.out.println(f.arraySum(data2));
		
		//System.out.println(f.arraySum({1,2,3})); 오류
		System.out.println(f.arraySum(new int[] {1,2,3}));

	}
	


}

class F {
	int arraySum(int[] array) {
		int sum = 0;
		for(int each: array) {
			sum += each;
		}
		return sum;
	}
}

class D {
	void print() {
		System.out.println("입력값이 없습니다.");
	}
	void print(int a) {
		System.out.println("정수 입력값 : " + a);
	}
	void print(double a) {
		System.out.println("실수 입력값 : " + a);		
	}
	void print(String a) {
		System.out.println("문자열 입력값 : " + a);
	}
}