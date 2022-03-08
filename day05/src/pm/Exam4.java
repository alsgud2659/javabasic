package pm;

import java.util.Arrays;

public class Exam4 {

	public static void main(String[] args) {
		//String - 자바에서 가장 많이 사용되는 자료형
		
//		int a = 12;
//		String b = "swift";
//		String c = new String("swift");
		
//		String str1 = new String("하이");
//		System.out.println(str1);
//		
//		String str2 = "안녕";
//		System.out.println(str2);
		
		// String의 특징 
		// 1. 한번 정의된 문자열은 변경할 수 없다.
		//    만약 문자열의 내용을 변경하면 자바가 기존 문자열을 수정하는것이 아니라 
		//	    새로운 문자열을 생성하여 사용하게 되는것이다. 기존의 객체는 버린다.
		// 2. 문자열을 입력해서 객체를 생성할 때 같은 문자열 끼리 객체를 공유한다.
		//    이것은 메모리의 효율성 때문이다.
		
//		String str1 = new String("안녕");
//		String str2 = str1;
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		str1 = "안녕하세요";
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		
//		int[] arr1 = new int[] {3,4,5};
//		int[] arr2 = arr1;
//		
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
//		
//		arr1[0] = 6;
//		arr1[1] = 7;
//		arr1[2] = 8;
//		
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
		
		
//		String str1 = new String("안녕");		// new 사용
//		String str2 = "안녕";
//		String str3 = "안녕";
//		String str4 = new String("안녕"); 	// new 사용
		
		// new로 생성할 때에는 동일한 문자열 객체가 있든 없든 무조건 새로운 객체를 생성한다.
		// new를 사용하지 않으면 이미 생성된 동일 문자열이 있으면 그 객체를 공유한다.
		
		
		
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str1);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
	
}










