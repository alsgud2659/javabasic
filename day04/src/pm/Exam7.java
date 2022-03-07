package pm;

import java.util.Arrays;

public class Exam7 {
	public static void main(String[] args) {
//		int[] a = new int[100];
//		
//		for (int i = 0; i < a.length; i++) {
//			a[i] = i + 1;
//		}
//		System.out.println(Arrays.toString(a));
		
		int[] arr1 = {5,4,3,2,1};
		int[] arr2 = new int[arr1.length];
		int j = 0;
		for (int i = arr1.length - 1; i >= 0; i--) {
			arr2[j] = arr1[i];
			j++;
		}
		System.out.println(Arrays.toString(arr2));
	}
}
