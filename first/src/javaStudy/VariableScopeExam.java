package javaStudy;

public class VariableScopeExam {
	int globalScope = 10; // 클래스내 글로벌변수
	static int staticVal = 10;
	
	public void scopeTest(int value) {
		
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
		
	}
	
	public void scopeTest2(int value2) {
		
		
	}
	
	// 정적 메소드이기 때문에 정적변수만 사용가능함
	// 정적 변수 or 정적 메소드 외 변수,메소드는 new로 선언해서 사용해야함
	public static void main(String[] args) {
		
		VariableScopeExam v1 = new VariableScopeExam();
		VariableScopeExam v2 = new VariableScopeExam();
		
		System.out.println(v1.globalScope);
		
		System.out.println(staticVal);
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		
		v1.globalScope = 10;
		v2.globalScope = 20;
		
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		v1.staticVal = 10;
		v2.staticVal = 40;
		staticVal = 100;
		
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		System.out.println(VariableScopeExam.staticVal);
		
		
	}

}
