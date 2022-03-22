package pm;

import java.util.Random;
import java.util.Scanner;

public class Exam10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("하한값:");
        int bottom = sc.nextInt();
        System.out.print("상한값:");
        int top = sc.nextInt();
        System.out.println("생성한 난수는 " + random(bottom, top) + "입니다.");
    }
    
    public static int random(int bottom, int top){
        int result = 0;
        result = (int)(Math.random() * (top - bottom + 1) + bottom);
        return result;
    }
}
