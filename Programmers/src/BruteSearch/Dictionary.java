package BruteSearch;

import java.util.*;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int answer = 0;
        
        String word = "AAAAE";
        
        Dictionary dic = new Dictionary();
		
		List<String> list = new ArrayList<String>();
		
		dic.dfs("", 0, list); // 변경
		
		//System.out.println(list);
		
		answer = list.indexOf(word) + 1;        
        
    }
    
	public void dfs(String str, int len, List<String> list) {
		if(len > 5)
			return;
		
		if(!str.equals(""))
			list.add(str);
		
		for(int i = 0; i < 5; i++)
			dfs(str + "AEIOU".charAt(i), len + 1, list);
	} 
}	


