package start;

import java.util.Calendar;

public class Hello2 {

	public static void main(String[] args) {
//		System.out.println("시작");
		/*int[] intArray = {};
		intArray[0] = 10;*/
/*
 * String descript[] = {"고승진" , "고승진1", "고승진2"};
 * 
 * System.out.println(descript[3]);
 */
	//	int intArray[5]; 이렇게는 안됨
	/*	int intArray[] = new int[5]; // 1차원배열
		
		intArray[0] = 10;
		
		System.out.println(intArray.length);
		
		int scores[];
		
		scores = new int[]{10 , 20 , 30 , 40 , 50};*/  // 배열선언
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		
		System.out.println(year);
		
		Student s1 = new Student();
		
		//s1.start();		
		System.out.println("학생이름은?" + s1.name);
	
	}
}
