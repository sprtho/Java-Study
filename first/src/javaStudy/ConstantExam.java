package javaStudy;

public class ConstantExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		i = 10;
		i = 5;
		final int J;  // ����� final ����, ����� �빮�ڼ���
		J = 10;
//		j = 5; // ����� �缱�� �Ұ�
		System.out.println(i);
		System.out.println(J);
		
		double circleArea;
		final double PI  = 3.14159;
		circleArea = 3 * 3 * PI;
		
		System.out.println(circleArea);
		
		final int OIL_PRICE = 1450; // ��������� _ ������
		
		char c = 'f';
		
		System.out.println(c);

	}

}
