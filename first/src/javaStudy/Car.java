package javaStudy;

public class Car {
	// Ÿ�� �ʵ��
	String name;
	int number;
	
	public Car(String name) {
//		this.name = name; // class ���� �ڽ��� ������ ������ �� this
		this(name, 0);
		System.out.println("�̸��� : " + name);
	}
	
	public Car() {
//		this.name = "�̸�����";
//		this.number = 0;
		this("�̸�����",0); // �Ʒ�  �����ε��� Car ������ ȣ��
//		System.out.println("�⺻ ������ ����");
	}
	
	public Car(String name, int num) {
		this.name = name;
		this.number = num;
		
	}
	
	public void run() {
		System.out.println("���޸���");
	}
	
	public void running() {
		System.out.println("���׸�");
	}

}
