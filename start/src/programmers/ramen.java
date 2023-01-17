// 라면공장 하루에 밀가루 1톤 사용해야 돌아감
// 힙 사용

package programmers;

import java.util.*;

public class ramen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 30; // 공급날짜
		
		int stock = 4; // 남아있는 밀가루 수
		
		int dates[] = {4 , 10 , 15}; // 공급 날짜
		
		int supplies[] = {30, 5 , 10}; // 공급 날짜에 공급되는 밀가루 양
		
		int answer = 0 ; // 최소 공급량 답
		
		PriorityQueue<Integer> priQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		int index = 0;
		
		for(int i = 0 ; i < k ; i++) {
			
			System.out.println(i + "번째 날 밀가루 양: " + stock );
			//공급먼저
			if((index < dates.length) && (i == dates[index])) {
				
				priQ.add(supplies[index]);
				
				index++;
			}
			
			if(stock == 0) {
				System.out.println("밀가루공급!!");
				stock += priQ.peek();
				answer++;
			}
			
			stock--;
			
		}
		
		System.out.println("답은 : " + answer);
		

	}

}
