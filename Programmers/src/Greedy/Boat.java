package Greedy;

import java.util.*;

public class Boat {

	public static void main(String[] args) {

        int answer = 0;
        
        int i,j;
        int min = 0;
        
        int[] people = {70, 50, 80, 50};
        
        int limit = 100;
        
        Arrays.sort(people);
 
        for(int max = people.length - 1; max>=min; max--) {
            if(people[min] + people[max] <= limit) {
                min++;
                answer++;
            }
            else {
                answer++;
            }
        }

/*		PriorityQueue<Integer> max_que = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> min_que = new PriorityQueue<Integer>();
		
		
		for(int i : people) {
			max_que.add(i);
			min_que.add(i);
		}
		
		System.out.println(max_que);
		
		while(max_que.size() > 0) {
			
			if(max_que.size() == 1) {
				answer++;
				break;
			}
			
			if(max_que.peek() + min_que.peek() <= limit) {
				min_que.remove(max_que.poll());
				max_que.remove(min_que.poll());
				answer++;
			}
			else {
				min_que.remove(max_que.poll());
				answer++;
			}
		}    */    
        
        System.out.println(answer);

	}

}
