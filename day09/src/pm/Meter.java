package pm;

public interface Meter {
	public void start();
	public int stop(int distance);
	
	public default void afterMidnight() {
		System.out.println("자정이 지났습니다. 할증이 필요한 경우 이 메서드를 오버라이드 해주세요");
	};
}
