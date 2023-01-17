package javaStudy;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		int j = 0;
//		int k = i/j;
//		System.out.println(k);
		
		try { // 수행할코드, 예외 발생 가능성이 있는 블록
			int k = i/j;
			System.out.println(k);
			
		}catch(Exception e) { // 예외 처리 블록
			System.out.println("0으로 나눌 수 없습니다. " + e.toString());
			
		}finally { // 예외 발생 여부에 상관없이 실행 (생략가능)
			System.out.println("Main end");
			
		}
		
	}

}
