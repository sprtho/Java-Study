package start;
import java.lang.String;


public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		
		
		try {
			
			int count[] = {1 , 2 , 3};
		
			//System.out.println(count.length);
		
			System.out.println(count[3]);
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �ʴ� �迭���Դϴ�.");
		
		}
/*		try {
			
			String a = "100";
			String b = "a100";
			
			int num1 = Integer.parseInt(a);
	//		int num2 = Integer.parseInt(b);
			
			System.out.println("������ ��:" + num1);
			
		} catch(NumberFormatException e) {
			System.out.println("���� Ÿ���� �ƴϿ��� ������ �� �����ϴ�.");
		}*/
		

	}

}
