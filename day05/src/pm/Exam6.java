package pm;

public class Exam6 {

	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5};
		
		for(int each : a) {
			System.out.println(each);
		}
		
		int[][] b = new int[][] {{1,3,5},{7,9}};
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다.";
		String name = str.substring(str.indexOf("홍"),str.indexOf("]"));
		System.out.println(name);
		int age = Integer.parseInt(str.substring(str.lastIndexOf("1"), str.lastIndexOf("]")));
		System.out.println(age);
	}

}


