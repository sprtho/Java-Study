package StackQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		List<Integer> answer = new ArrayList<>();
		Queue<Integer> q =  new LinkedList<>();
		
		for(int i = 0; i < progresses.length; i++) {
			
			double result = (100 - progresses[i]) / (double) speeds[i];
			int date = (int)Math.ceil(result);
			
			if (q.isEmpty()==false && q.peek() < date) {
				answer.add(q.size());
				q.clear();
			}
			
			q.add(date);
			
		}
		
		answer.add(q.size());
		
		System.out.println(answer);

	}

}
