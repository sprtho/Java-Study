package BruteSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MinRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		PriorityQueue<Integer> max_size = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> min_size = new PriorityQueue<>(Collections.reverseOrder());
		
		
		for(int i = 0; i < sizes.length; i++) {
			
			if(sizes[i][0] >= sizes[i][1]) {
				max_size.add(sizes[i][0]);
				min_size.add(sizes[i][1]);
			}
			else {
				min_size.add(sizes[i][0]);
				max_size.add(sizes[i][1]);
			}			
		}
		
		int answer = 0;
		answer = max_size.peek() * min_size.peek();
		
		System.out.println(max_size.peek());
		System.out.println(min_size.peek());
		
		
		

	}

}
