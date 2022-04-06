package homework;
import java.util.Scanner; 

public class homework25 {

	public static void main(String[] args) {
		// #45
		Scanner sc = new Scanner(System.in);
		System.out.print("버전1 입력: ");
		String version1 = sc.nextLine();
		System.out.print("버전2 입력: ");
		String version2 = sc.nextLine();
		
		System.out.println("result : " + compare(version1, version2));
		
		
	}
	public static int compare(String version1, String version2) {
		String[] ver1 = version1.split("\\.");	// version1을 입력받아 '.'을기준으로 나눈 후 배열에 넣음
		String[] ver2 = version2.split("\\.");  // version2을 입력받아 '.'을기준으로 나눈 후 배열에 넣음
		
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
