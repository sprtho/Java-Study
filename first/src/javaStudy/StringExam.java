package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "hello"; // �̷��� �����ϸ� �������
		String str2 = "hello2";
		
		String str3 = new String("hello"); // ������� x ���ο� ������
		String str4 = new String("hello");
		
		if (str3.equals(str4))
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("�ٸ���");
		}
		
		
		System.out.println(str1.substring(3));

		//System.out.println(str1);
	}

}
