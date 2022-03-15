package pm;

public class Mycalc implements Calculator {
	
	@Override
	public int plus(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	@Override
	public int multiple(int i, int j) {
		// TODO Auto-generated method stub
		return i * j;
	}
	
	public int exec(int i, int j) {
		return i + j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
