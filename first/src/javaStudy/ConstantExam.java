package javaStudy;

public class ConstantExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		i = 10;
		i = 5;
		final int J;  // 상수는 final 선언, 상수는 대문자선언
		J = 10;
//		j = 5; // 상수는 재선언 불가
		System.out.println(i);
		System.out.println(J);
		
		double circleArea;
		final double PI  = 3.14159;
		circleArea = 3 * 3 * PI;
		
		System.out.println(circleArea);
		
		final int OIL_PRICE = 1450; // 상수선언은 _ 나눠줌
		
		char c = 'f';
		
		System.out.println(c);

	}

}
