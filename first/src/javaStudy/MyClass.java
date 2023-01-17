package javaStudy;

public class MyClass {
	
	//public 리턴타입 메소드명 (매개변수 ) { 구현 }

	public void method1() {
		System.out.println("m1이 실행됨...");
	}
	
	public void method2(int x) {
		System.out.println("m2이 실행됨" + x);
	}
	
	public int method3() {
		System.out.println("m3 리턴 실행");
		return 10;
	}
	
	public void method4(int a, int b) {
		System.out.println(a + b  + "합");
	}
	
	public int method5(int y) {
		System.out.println(y + "를 반환");
		return y + 79;
	}
}
