package javaStudy;

public class SwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch, case, default, break
		
		int value = 1;
		
		// jdk 7까지는 정수만 가능했지만, 이후에는 value가 문자열도 가능
		switch(value) {
			case 1: 
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default :
				System.out.println("그외");
				break;
		
		}
		
		String str = "A";
		
		switch(str) {
			case "A":
				System.out.println("A");
				break;
		
		}

	}

}
