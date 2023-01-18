package StackQueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer = 1;
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
		
		for(int i : priorities) {
			queue.offer(i);
		}
		
		System.out.println(queue);
		
		while(!queue.isEmpty()) {
			
			for(int i = 0; i < priorities.length; i++) {
				
				if (queue.peek() == priorities[i]) {
					
					if (location == i) {
						//return answer;
					}
					
					answer++;
					queue.poll();
					
				}
				
			}
		}
		
	}

}
