package javaStudy;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		int j = 0;
//		int k = i/j;
//		System.out.println(k);
		
		try { // �������ڵ�, ���� �߻� ���ɼ��� �ִ� ���
			int k = i/j;
			System.out.println(k);
			
		}catch(Exception e) { // ���� ó�� ���
			System.out.println("0���� ���� �� �����ϴ�. " + e.toString());
			
		}finally { // ���� �߻� ���ο� ������� ���� (��������)
			System.out.println("Main end");
			
		}
		
	}

}
