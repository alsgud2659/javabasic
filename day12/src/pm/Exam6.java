package pm;

public class Exam6 extends Thread{
	@Override
	public void run() {
		String[] strArray = { "하나", "둘", "셋", "넷", "다섯" };
		try {Thread.sleep(10);} catch(InterruptedException e) {}
		for (String b : strArray) {
			System.out.println(" - 자막번호" + b);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
	

	public static void main(String[] args) {
		// 객체 생성 및 시작
		Thread smiFileThread = new Exam6();
		smiFileThread.start();
		
		int[] intArray = { 1, 2, 3, 4, 5 }; // 비디오 프레임
		
		for (int a : intArray) {
			System.out.print("비디오 프레임 " + a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
		
	}

}


// 이전에 단일 쓰레드로 실행했던 비디오 프레임과 자막을 출력하는 프로그램을 멀티 쓰레드로 변경하였다.
// 출력하고자 하는 작업은 비디오 프레임의 번호화 자막의 동시 출력이다.
// 프로그램이 처음 실행될 떄 이미 main쓰레드가 실행되고 있었으므로 이 2개의 작업을 실행하기 위해서는 적어도 하나 이상의 쓰레드를 추가로 생성하여 실행해야 한다.


// Thread 클래스를 상속받아서 클래스를 정의 했고,
// 객체를 생성하여 start()메서드로 실행 하였다.
// main 쓰레드와 smiFileThread를 사용하여 각각 비디오 번호와 자막 번호를 출력했다.
// 참고로 멀티 쓰레드는 독립적으로 실행되기 떄문에, 먼저 start()메서드로 호출이 되었다 하더라도
// 나중에 실행된 쓰레드보다 늦게 실행 될 수 있다.
// 이런 이유로 자막번호가 항상 비디오 번호 뒤에 나오도록 쓰레드에 Thread.sleep(10)을 추가해서 0.01초 늦게 출력되도록 했다.
