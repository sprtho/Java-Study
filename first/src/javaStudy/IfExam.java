package javaStudy;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int value = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			value = scan.nextInt();
			System.out.println("입력받은 값 : " +  value);
			
		}while(value != 10);
			
		
	}

}
