package Hash;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TeleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] phone_book = {"119", "97674223", "1195524421"};
		
		boolean answer = false;
		
		Arrays.sort(phone_book);
		
		for(String s : phone_book)
			System.out.println(s);
		
		for(int i = 0; i < phone_book.length - 1; i++) {
			
			if(phone_book[i+1].indexOf(phone_book[i]) == 0) {
				answer = false;
				break;
			}
			
		}
		
		
		System.out.println("119".contains("119"));
		
		
		
		

	}

}
