package start;

import java.util.Calendar;

public class Hello2 {

	public static void main(String[] args) {
//		System.out.println("����");
		/*int[] intArray = {};
		intArray[0] = 10;*/
/*
 * String descript[] = {"�����" , "�����1", "�����2"};
 * 
 * System.out.println(descript[3]);
 */
	//	int intArray[5]; �̷��Դ� �ȵ�
	/*	int intArray[] = new int[5]; // 1�����迭
		
		intArray[0] = 10;
		
		System.out.println(intArray.length);
		
		int scores[];
		
		scores = new int[]{10 , 20 , 30 , 40 , 50};*/  // �迭����
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		
		System.out.println(year);
		
		Student s1 = new Student();
		
		//s1.start();		
		System.out.println("�л��̸���?" + s1.name);
	
	}
}
