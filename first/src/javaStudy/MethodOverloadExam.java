package javaStudy;

public class MethodOverloadExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myclass2 mc2 = new Myclass2();
		
		int value = mc2.plus(5, 10);
		
		System.out.println(value);
		
		System.out.println(mc2.plus("고승진", "입니다"));

	}

}
