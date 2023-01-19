package Sort;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";
		
		int[] numbers = {3, 30, 34, 5, 9};
		
		String[] nums = new String[numbers.length];
		
		for (int i = 0; i < nums.length; i++)
			nums[i] = Integer.toString(numbers[i]);
		
		
//		Arrays.sort(nums, new Comparator<String>() {
//			public int compare(String a, String b) {
//				return (a + b).compareTo(b + a);
//			}
//		});
//		
//		Arrays.sort(nums, (a,b) -> {
//			return (b+a).compareTo(a+b);
//		});
		
		Arrays.sort(nums, (a,b) -> (b+a).compareTo(a+b));
		
		//if (str[0].equals("0"))
			//return "0";
		
		for(String s: nums)
			answer += s; 
		
		System.out.println(answer);
		
		

	}

}
