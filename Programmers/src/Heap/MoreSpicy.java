package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MoreSpicy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scoville = {1, 2, 9, 3, 10, 12};
		int answer = 0;
		
		PriorityQueue<Integer> min = new PriorityQueue<>();
//		PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder()); // 역순
		
		for (int i : scoville)
			min.add(i);
		
		while(true) {
			
			int k = 0;
			
			if(min.size() < 2) {
				break;
			}
			
			if(min.peek() >= 7) {
				break;
			}
			
			int num1;
			int num2;
			
			num1 = min.poll();
			num2 = min.poll();
			
			System.out.println(num1);
			System.out.println(num2);
			
			k = num1 + (num2 * 2);
			
			min.add(k);
			
			answer++;
			
		}
		
		System.out.println(min);
		System.out.println(answer);

	}

}
