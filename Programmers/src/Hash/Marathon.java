package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Marathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
		List<String> answer = new ArrayList<String>();
		
		for(String s : participant)
			answer.add(s);
		
		System.out.println(answer);
		
		for(int i = 0; i < completion.length; i++) {
			
			answer.remove(completion[i]);
			
		}
		
		System.out.println(answer);
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("승진", 1);
		hm.put("승진", hm.getOrDefault("승진", 0)+ 100);
		
		System.out.println(hm);
		
		
		
		
		

	}

}
