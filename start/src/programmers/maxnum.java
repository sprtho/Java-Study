// �Ǻ���ġ

package programmers;

import java.util.Scanner;

public class maxnum {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		
		int n = 0;
		
		int answer = 0;
		
		int number[] = new int[100000];
		
		System.out.println("���ڸ��Է��ϼ���:");
		
		n = scan.nextInt();
		
		if(n<2) {
			System.out.println("2�̻� �Է��ϼ���");
			return;
		}
		
		number[0] = 0;
		number[1] = 1;
		
		for(i=2; i<=n ; i++) {
			number[i] = number[i-2] + number[i-1];
		}
		
		
		System.out.println(number[n]);

	}

}
