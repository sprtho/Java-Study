// �����ձ� [��tank��, ��kick��, ��know��, ��wheel��, ��land��, ��dream��, ��mother��, ��robot��, ��tank��]

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
	
		stk.push(words[0]); // stack �Ⱦ��� linked list? �װŽἭ �ص��� contain���� ������ �ܾ� �ִ����� Ȯ���ϸ� ��
		
		for(int i = 1 ; i< words.length; i++) {
			
			person++;
			
			System.out.println(person);
			
			
			if(stk.contains(words[i])==true ) {
				System.out.println("�ߺ��� �ܾ� �ɸ�");
				System.out.println(person + "��°���" + cnt + "���� �Ͽ� �ɸ�");
				break;
			}
		
			char x = words[i-1].charAt(words[i-1].length()-1);	// �տ� ����
				
			char y = words[i].charAt(0);					// �ڿ� ù��
			
			if(x!=y) {
				System.out.println("�մܾ�� �ٸ�");
				System.out.println(person + "��°���" + cnt + "���� �Ͽ� �ɸ�");
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
