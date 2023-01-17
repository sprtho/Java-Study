package javaStudy;

public class EnumExam {
	
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gender1;
		
		gender1 = EnumExam.MALE;
		
		gender1 = "boy";
		
		Gender gender2;
	
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender = "boy"; 오류
		// enum에 선언한 변수만 넣을수있음 아니면 오류남
	}

}

enum Gender {
	MALE, FEMALE;
}