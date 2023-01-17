// Programmers 프린터

package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		System.out.println("숫자를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		System.out.println(a);
		
		int num[];
		
		num = new int[] {1,2,3,4,5};
		
		System.out.println(num[2]);*/
		
		int[] priorities = {2 , 1 , 3 ,2};
		
		//PriorityQueue<Integer> priorityQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> priorityQ = new PriorityQueue<>(Collections.reverseOrder());
		
		
		// 해당 for문은 우측 값이 int 값으로해서 for문 안에 들어감
		for(int task : priorities) {
			System.out.println(task);
			priorityQ.add(task);
		}
		
		System.out.println("남은 큐가 있나요??" + priorityQ.isEmpty());
		
	/*	while(!priorityQ.isEmpty()) {
			System.out.println(priorityQ.peek());
			priorityQ.poll();
		}*/
		
		int location = 0;
		
		int answer = 1;
		
		// 2 1 3 2
		while(!priorityQ.isEmpty()) {
			for(int i=0; i<priorities.length; i++) {
				
System.out.println("값비교:" + priorities[i] + priorityQ.peek());
				if(priorities[i] == priorityQ.peek()) {
					
					if(i == location) {
						System.out.println("답은:" + answer);
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
