package javaStudy;

public class VariableScopeExam {
	int globalScope = 10; // Ŭ������ �۷ι�����
	static int staticVal = 10;
	
	public void scopeTest(int value) {
		
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
		
	}
	
	public void scopeTest2(int value2) {
		
		
	}
	
	// ���� �޼ҵ��̱� ������ ���������� ��밡����
	// ���� ���� or ���� �޼ҵ� �� ����,�޼ҵ�� new�� �����ؼ� ����ؾ���
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
