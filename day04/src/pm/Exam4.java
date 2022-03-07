package pm;

public class Exam4 {

	public static void main(String[] args) {
		/* 배열
		 * 동일한 자료형을 묶어 저장하는 참조형 자료형이다.
		 * 최소 생성시 지정한 크기를 절대 변경할 수 없는 특징이 있다.
		 * 
		 * 1. 배열 선언 (자료형[] 변수명; or 자료형 변수명[];)
		 * int[] a;		int a[];
		 * double[] b;	double b[];
		 * String[] c;	String c[];
		 * 
		 * 배열을 선언하게 되면 메모리에 변수의 공간만 생성되고 공간 안은 비운채로 일단 둔다.
		 * 
		 * 2. 배열 객체 생성
		 * 
		 * new int[3];
		 * new String[5];
		 * 
		 * 3. 배열 자료형 변수에 객체 넣기
		 * 
		 * int[] a = new int[3];
		 * 
		 * int 배열 자료형의 변수명 a 참조변수에 새로운 int자료형 3개를 저장할 것이다.
		 * 
		 */
		
		// 배열 선언 방법 1
		int[] array1 = new int[3];
		int[] array2;
		array2 = new int[3];
		
		// 배열 선언 방법 2
		int array3[] = new int[3];
		int array4[];
		
		// 다양한 배열 선언 방법
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		String[] array8 = new String[9];
		
		// 배열 객체에 값 넣기
		int[] a = new int[3];
		
		//배열을 선언함과 동시에 객체를 생성하여 초기화 하였다. 초기화 값은 0이다.
		a[0] = 3;
		a[1] = 4;
		a[2] = 5;
		
		// 배열 객체에서 값 꺼내기
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		//System.out.println(a[5]); 없는 인덱스 접근시 java.lang.ArrayIndexOutOfBoundsException 예외 발생!!
		
		// 배열 객체 생성과 함께 값 넣기
		
		int[] b = new int[] {3,4,5}; //fm
		
		
		int[] c = {3,4,5};
		
//		int[] c;		// 선언과 대입이 분리가 불가능
//		c = {3,4,5};
		
	}

}



























