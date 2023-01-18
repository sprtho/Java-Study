package Hash;

import java.util.HashSet;

public class Pocketmon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,3,3,2,2,2};
		
		boolean result;
		
		int answer = 0;
		
		HashSet<Integer> hash = new HashSet<>();
		
		for(int i : nums) {
			result = hash.add(i);
			System.out.println("숫자"+ i + "결과" + result);
		}
			 
		
		System.out.println(hash);
		
		int choice = 0;
		
		choice = nums.length / 2;
		
		if (hash.size() > choice) {
			answer = choice;
		}
		else {
			answer = hash.size();
		}
		
		System.out.println(answer);
		

	}

}
