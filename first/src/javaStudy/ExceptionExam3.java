package javaStudy;

public class ExceptionExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		int j = 0;
		
		try {
		int k = divide(i , j);
		System.out.println(k);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}

	}
	
	public static int divide(int i, int j) throws IllegalArgumentException {
		if(j == 0) {
//			System.out.println("2번째 매개변수는 0이면 안됩니다");
//			return 0;
			throw new IllegalArgumentException("0으로 나눌 수 없습니다."); // 예외처리 발생시키기
		}
		int k = i / j;
		return k;
		
	}

}
