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
		
//		gender = "boy"; ����
		// enum�� ������ ������ ���������� �ƴϸ� ������
	}

}

enum Gender {
	MALE, FEMALE;
}