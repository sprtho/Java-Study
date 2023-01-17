package programmers;
import java.util.*;

import java.util.Arrays;

public class maxnum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num[] = {6 , 10 , 2};
		int num[] = {3, 30, 34, 5, 9};
		int num2[] = {3, 30, 34, 5, 9};
		String answer = "";
		String arr[] = new String[num.length];
		
		//System.out.println(num.length);
		
	/*	for(int i : num) {
			arr[i] = (String.valueOf(i));
		}*/
		
		for(int i=0; i<num.length ; i++) {
			arr[i] = (String.valueOf(num[i]));
		}
		
		Arrays.sort(arr , new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s2+s1).compareTo(s1+s2);
			}
		});
		
		//Arrays.sort(arr); // 배열에서 작은수부터 정렬
		
		for(String name : arr)
			answer += name;
		
		
		System.out.println(answer);
		
		
		System.out.println("65".compareTo("56"));
		
		
//		System.out.println(arr[1]);
		
		
		
	}

}
