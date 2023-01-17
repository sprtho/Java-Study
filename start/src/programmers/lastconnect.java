// 끝말잇기 [“tank”, “kick”, “know”, “wheel”, “land”, “dream”, “mother”, “robot”, “tank”]

package programmers;

import java.util.*;

public class lastconnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stk = new Stack<>();
		
		int n = 3;
		
		int person = 1;
		
		int cnt = 1;
		
		String words[] = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//		String words[] = {"hello", "one", "even", "never", "now", "world", "draw"};
		
		//System.out.println(words[0]);
	
		stk.push(words[0]); // stack 안쓰고 linked list? 그거써서 해도됨 contain으로 기존에 단어 있는지만 확인하면 됨
		
		for(int i = 1 ; i< words.length; i++) {
			
			person++;
			
			System.out.println(person);
			
			
			if(stk.contains(words[i])==true ) {
				System.out.println("중복된 단어 걸림");
				System.out.println(person + "번째사람" + cnt + "번쨰 턴에 걸림");
				break;
			}
		
			char x = words[i-1].charAt(words[i-1].length()-1);	// 앞에 끝자
				
			char y = words[i].charAt(0);					// 뒤에 첫자
			
			if(x!=y) {
				System.out.println("앞단어와 다름");
				System.out.println(person + "번째사람" + cnt + "번쨰 턴에 걸림");
				break;
			}
			
			stk.push(words[i]);
		
			
			if(person==n) {
				person = 0;
				cnt++;
			}
		}
		
		System.out.println(stk);

	}

}
