package homework;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Homework26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("입력할 정수의 개수:");
	    int num = sc.nextInt();
	    Integer[] arr = new Integer[num];
	    for(int i = 0; i < num; i++){
	      System.out.print("정수:");
	      int a = sc.nextInt();
	      arr[i] = a;
	    }
	    
	    Arrays.sort(arr, Collections.reverseOrder());
	    System.out.println(Arrays.toString(arr));    
	}	
}

