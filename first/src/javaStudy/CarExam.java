package javaStudy;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(); // car class
		Car c2 = new Car();
		
		c1.name = "소방차";
		c1.number = 1234;
		
		c2.name = "구급차";
		c2.number = 1111;
		
		System.out.println(c1.name);
		
		int a = 5;
		
		int b = 3;
		System.out.println(a + b + "합");

	}

}
