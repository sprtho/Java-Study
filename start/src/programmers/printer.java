// Programmers ������

package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		System.out.println("���ڸ� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		System.out.println(a);
		
		int num[];
		
		num = new int[] {1,2,3,4,5};
		
		System.out.println(num[2]);*/
		
		int[] priorities = {2 , 1 , 3 ,2};
		
		//PriorityQueue<Integer> priorityQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> priorityQ = new PriorityQueue<>(Collections.reverseOrder());
		
		
		// �ش� for���� ���� ���� int �������ؼ� for�� �ȿ� ��
		for(int task : priorities) {
			System.out.println(task);
			priorityQ.add(task);
		}
		
		System.out.println("���� ť�� �ֳ���??" + priorityQ.isEmpty());
		
	/*	while(!priorityQ.isEmpty()) {
			System.out.println(priorityQ.peek());
			priorityQ.poll();
		}*/
		
		int location = 0;
		
		int answer = 1;
		
		// 2 1 3 2
		while(!priorityQ.isEmpty()) {
			for(int i=0; i<priorities.length; i++) {
				
System.out.println("����:" + priorities[i] + priorityQ.peek());
				if(priorities[i] == priorityQ.peek()) {
					
					if(i == location) {
						System.out.println("����:" + answer);
						priorityQ.clear();
						break;
					}
					
					priorityQ.poll();
					System.out.println("i:" + i + "  peek:" + priorityQ.peek());
					answer++;
					
					
				}
			}
		}
		
		
		
		
	}

}
