// ������ �Ϸ翡 �а��� 1�� ����ؾ� ���ư�
// �� ���

package programmers;

import java.util.*;

public class ramen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 30; // ���޳�¥
		
		int stock = 4; // �����ִ� �а��� ��
		
		int dates[] = {4 , 10 , 15}; // ���� ��¥
		
		int supplies[] = {30, 5 , 10}; // ���� ��¥�� ���޵Ǵ� �а��� ��
		
		int answer = 0 ; // �ּ� ���޷� ��
		
		PriorityQueue<Integer> priQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		int index = 0;
		
		for(int i = 0 ; i < k ; i++) {
			
			System.out.println(i + "��° �� �а��� ��: " + stock );
			//���޸���
			if((index < dates.length) && (i == dates[index])) {
				
				priQ.add(supplies[index]);
				
				index++;
			}
			
			if(stock == 0) {
				System.out.println("�а������!!");
				stock += priQ.peek();
				answer++;
			}
			
			stock--;
			
		}
		
		System.out.println("���� : " + answer);
		

	}

}
