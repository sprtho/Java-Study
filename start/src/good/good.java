package good;

import java.util.Scanner;

public class good {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
/*		System.out.println("숫자를입력:");
		
		int num = System.in.read();
		
		System.out.println(num);*/
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		
		System.out.println("글자를 입력하세요:");
		
		name = scanner.nextLine();
		
		System.out.println(name.length());
		
		double num = Math.random();
		
		System.out.println(num);
		
		int num = scanner.nextInt();
		
		String a = "abcd eee ddd";
		
		System.out.println(a);
		
		String b = a.concat("edf");
		
		String name[] = a.split(" ");
		
		System.out.println(name.length);
		
		for(String c : name) {
			System.out.println(c);
		}
		
		
		
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
