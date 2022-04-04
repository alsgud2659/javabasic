package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class homework25 {

	public static void main(String[] args) {
		// #45
		String version1 = "1.01";
		String version2 = "1.001";
		
		System.out.println(compare(version1, version2));
		
		
	}
	public static int compare(String version1, String version2) {
		String[] ver1 = version1.split("\\.");
		String[] ver2 = version2.split("\\.");
		
		int max = Math.max(ver1.length, ver2.length);
		
		for (int i = 0; i < max; i++) {
			int temp1 = 0;
			int temp2 = 0;
			if(i < ver1.length) {
				temp1 = Integer.parseInt(ver1[i]);
			}
			if(i < ver2.length) {
				temp2 = Integer.parseInt(ver2[i]);
			}
			
			if(temp1 > temp2) {
				return 1;
			}else if(temp1 < temp2) {
				return -1;
			}
			
		}
		return 0;
	}
}
