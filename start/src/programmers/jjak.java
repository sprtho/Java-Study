// ¾ËÆÄºª Â¦Áþ±â

package programmers;

import java.util.*;

public class jjak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "baabaa";
		
		int answer = 0;
		
		Stack<String> stk = new Stack<>();
		
		System.out.println(s.charAt(0));
		
		for(int i=0; i<s.length() ; i++) {
			
			
			if(stk.isEmpty()) {
				stk.add(s.substring(i, i+1));
			}
			else if(stk.peek().equals(s.substring(i, i+1))) {
				stk.pop();	
			}
			else {
				stk.add(s.substring(i, i+1));
			}
			
		}
		
		if(stk.isEmpty()) {
			answer = 1;
		}
		else {
			answer = 0;
		}
		
		System.out.println(answer);
		
		
	}

}
