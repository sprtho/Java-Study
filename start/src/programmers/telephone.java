// ��ȭ��ȣ ��� HaseMap

package programmers;

import java.util.HashMap;

public class telephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean answer = false;
		
		HashMap<String , String> hm = new HashMap<>();
		
		String[] phone_book = {"119", "97674223", "1195524421"};
		
//		System.out.println(phone_book[1]);
		
		for(String name : phone_book) {
			hm.put(name , "prifix");
		}
		
		System.out.println(phone_book[1].length());
		
		for(String phone_number : phone_book) {
			
			for(int i = 1 ; i<phone_number.length(); i++) {
				
				
				System.out.println(phone_number.substring(0,i));
				
				if(hm.containsKey(phone_number.substring(0,i))) { // containsKey -> boolean
					System.out.println("����" + phone_number.substring(0,i));
					answer = false;
				}
				
			}
			
		}
		
	
		
		
//		System.out.println(animal.substring(1,3)); // substring -> ���� �ε������� ���ε��� �ٷ� ���� �ε�������'
		
		System.out.println(answer);
	}

}
