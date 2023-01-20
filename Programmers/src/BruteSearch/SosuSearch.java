package BruteSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SosuSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		
		SosuSearch sosu = new SosuSearch();
		
		String numbers = "17";
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		List<Integer> list = new ArrayList<>();
		
		sosu.permutation("", numbers, set, list);
		
		System.out.println(set);
		
		int cnt = 0;
		for(int i : set) {
			cnt = 0;
			
			if(i <= 1) {
				continue;
			}
			
			for(int j = 2 ; j <= (int)Math.sqrt(i); j++) {
				if(i % j == 0) {
					cnt++;
					break;
				} 
			}
			
			if(cnt == 0)
				answer++;
		}        		

	}
	
	public void permutation(String prefix, String str, HashSet<Integer> set, List<Integer> list) {
		int n = str.length();
		if(!prefix.equals("")) {
			set.add(Integer.valueOf(prefix));
			list.add(Integer.valueOf(prefix));
		}
		
		for(int i = 0; i < n; i++) {
			permutation(prefix + str.charAt(i), str.substring(0, i)+
					str.substring(i+1, n), set, list);
		}
	} 

}
