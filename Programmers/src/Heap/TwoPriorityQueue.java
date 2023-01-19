package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TwoPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = {0,0};
		
		String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		
		PriorityQueue<Integer> maxq = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> minq = new PriorityQueue<>();
		
		for (String s : operations) {
			String[] operation = s.split(" ");
			int num = Integer.parseInt(operation[1]);
			
			if(operation[0].equals("I")) {
				maxq.add(num);
				minq.add(num);
			}
			else if(operation[0].equals("D")) {
				if(minq.size() > 0) {
					if(num == 1) {
						int max = maxq.poll();
						minq.remove(max);
					}
					else {
						int min = minq.poll();
						maxq.remove(min);
					}
				}
			}
			
		}
		
		if(maxq.size() >= 2) {
			answer[0] = maxq.peek();
			answer[1] = minq.peek();
		}
		
		System.out.println(maxq);
		System.out.println(minq);
		
		
		
		
		
	/*	ArrayList<Integer> num_array = new ArrayList<>();
		ArrayList<Integer> answer = new ArrayList<>();
			for (String s : operations) {
			String[] operation = s.split(" ");
			int num = Integer.parseInt(operation[1]);
			System.out.println(num);
			System.out.println(operation[0]);
			
			if(operation[0].equals("I")) {
				num_array.add(num);
				Collections.sort(num_array);
			}
			else if(operation[0].equals("D")) {
				
				if(num_array.size() == 0) {
					continue;
				}
				
				if(num == 1) {
					num_array.remove(num_array.size() - 1);
				}
				else {
					num_array.remove(0);
				}

			}
			System.out.println(num_array);
			
		}
		Collections.sort(num_array);
		
		if(num_array.size() == 0) {
			answer.add(0);
			answer.add(0);
		}
		else {
			answer.add(num_array.get(num_array.size() - 1));
			answer.add(num_array.get(0));
		}
		
		
		System.out.println(answer);*/
		

	}

}
