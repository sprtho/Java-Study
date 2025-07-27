package BruteSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		
		Temp sosu = new Temp();
		
		String numbers = "13579"; // push test
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		sosu.permutation("", numbers, set);
		
		System.out.println(set);
		  		
		String name = "seung jin";
		
		System.out.println(name.startsWith("seung"));
		
		for(String s : name.split(" "))
			System.out.println(s);
		
		StringBuffer names = new StringBuffer("seungjin");
		
		System.out.println(names.reverse());
		
		

	}
	
	public void permutation(String prefix, String str, HashSet<Integer> set) {
		int n = str.length();
		if(!prefix.equals("") && prefix.length() == 2) {
			set.add(Integer.valueOf(prefix));
		}
		
		for(int i = 0; i < n; i++) {
			permutation(prefix + str.charAt(i), str.substring(0, i)+
					str.substring(i+1, n), set);
		}
	}

}
