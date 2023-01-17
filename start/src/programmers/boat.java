// 구명보트 최소한의 횟수를 이용해서 사람들 구출

package programmers;

import java.util.*;

public class boat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer = 0;
		int limit = 100;
		int people[] = {70 ,  80 , 50 , 30 , 40 , 10 , 60};//[70kg, 50kg, 80kg, 50kg]
		
//		PriorityQueue<Integer> prique = new PriorityQueue<Integer>();
		
		Arrays.sort(people); // 재배열
		
	/*	for(int i : people)
			System.out.println(i);*/
		
		int j = 0;
		
		
		for(int i=people.length-1 ; i>=0 ; i--) {
			
			System.out.println(people[i] + "//" + people[j]);
			
			if(i==j) {
				answer++;
				break;
			}
			
			if(i<j)	
				break;
			
			
			
			if(people[i]+people[j] > limit) {
				answer += 1;
			}
			else {
				answer += 1;
				j++;
			}
			
			
			
		}
		
		System.out.println(answer);
		
		

	}

}
