// ¥ı∏ ∞‘

package programmers;

import java.util.PriorityQueue;

public class hot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> priQ = new PriorityQueue<Integer>();
		
		int scoville[] = {1, 2, 3, 9, 10, 12};
		
		int answer = 0;
		
		int k = 7;
		
		int tmp = 0 , cnt = 0 , sum = 0 , tmp2 = 0;

		for(int i : scoville)
			priQ.add(i);
		
		System.out.println("√÷√ : " + priQ);
		
	
		//System.out.println(priQ);
		
		while(!priQ.isEmpty()) {
			
			if(priQ.peek() <= k ) {
				
				tmp = priQ.poll();
				
				tmp2 = priQ.poll();
				
				sum = tmp + (tmp2 * 2);
				
				priQ.add(sum);
				
				
				System.out.println(priQ);
				
				cnt++;
					
			}
			
			else {
				priQ.clear();
			}
			
		}
		
		System.out.println("ºØ¿∫ »Ωºˆ¥¬? " + cnt );
			
		
	}

}
