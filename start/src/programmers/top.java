//프로그래머스 탑

package programmers;

import java.util.Stack;

public class top {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stk = new Stack<Integer>();
		
//		int heights[] = {6 , 9 , 5 , 7 , 4};
		int heights[] = {3 , 9 , 9 , 3 , 5 , 7 , 2};
//		System.out.println(heights.length);
		
		int answer[] = new int[heights.length];
		
		for(int i=0; i<heights.length ; i++) {
			stk.push(heights[i]);
		}
		//System.out.println(stk);
//		System.out.println(stk.size());
		
		int index;
		
		//6 9 5 7 4
		while(!stk.isEmpty()) {
			index = stk.pop();
			/*System.out.println(index);
			System.out.println(stk.size());*/
			
			for(int j=stk.size()-1; j>=0 ; j--) {
				
				System.out.println("heights:"+ heights[j] + " index:" + index );
				if (heights[j] > index) {
					
					answer[stk.size()] = j+1;
					break;
					
				}
			}
		}
		
		for(int k : answer)
			System.out.println(k);
	

	}

}
