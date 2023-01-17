package javaStudy;

public interface Calculator {

	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	default int exec(int i, int j) { // default 키워드를 이용하면 메소드 구현 가능함
		return i + j;
	}
	
	public static int exec2(int i, int j) {
		return i * j;
	}
}
