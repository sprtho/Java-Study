package StackQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StockPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {1, 2, 3, 2, 3};
		
		Queue<Integer> queue = new LinkedList<Integer>();
		List<Integer> answer = new ArrayList<>();
	
		
		for(int i : prices)
			queue.offer(i);
		
		System.out.println(queue);
		
		int cnt = 0;
		
		while(!queue.isEmpty()) {
		
			int stock = queue.peek();
			
			
			
		}
			

	}

}
