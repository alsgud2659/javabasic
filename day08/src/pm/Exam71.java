package pm;

public class Exam71 {

	public static void main(String[] args) {
		// 부모클래스에게 init() 메서드가 있고, 그 메서드에 500줄의 코드가 있다.
		// 자식 클래스는 그 부모클래스의 기능에다가 어떤 한줄만 추가하고 싶을때 
		// super가 없다면 자식클래스에는 부모클래스의 메서드에 있는 500줄과 한줄을 모두 작성해야 한다.
		// 그런데 super를 사용하면 자식클래스의 메서드에서 부모클래스의 메서드를 호출하고 추가 코드 한줄만 작성하면 된다.
	}

}


class U {
	void init() {
		// 어쩌구 저쩌구 500줄 
	}
}

class I extends U{
	void init() {
		// 어쩌구 저쩌구 500줄
		// 화면 출력 메서드
	}
	
}

class K extends U {
	void init() {
		super.init();
		// 화면 출력 메서드
	}
}