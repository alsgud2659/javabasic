package pm;

public class Exam7 {

	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i < 1000; i++) {
//			if(i % 3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		
//		*
//		**
//		***
//		****
//		*****
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		*****
//		****
//		***
//		**
//		*
		
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int[] scores = {70, 60, 55, 75, 95, 80, 80, 85, 100};
		int sum = 0;
		int avg = 0;
		int max = 0;
		int min = 100;
		for (int score : scores) {
			sum += score;
			
			if (score > max) {
				max = score;
			}
			if (score < min) {
				min = score;
			}
		}
		avg = sum / scores.length;
		
		System.out.println("sum :" + sum);
		System.out.println("avg :" + avg);
		System.out.println("min :" + min);
		System.out.println("max :" + max);
		
		
	}

}











