package Hash;

import java.util.HashMap;

public class Clothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer = 1;
		
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(int i = 0; i < clothes.length; i++) {
			
			hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0)+1);
			
		}
		
		System.out.println(hm);
		
		for(String s : hm.keySet())
			System.out.println(s);
		
		for(int i : hm.values())
			System.out.println(i);
		
		for(int i : hm.values())
			answer *= i+1;
			
		System.out.println(answer - 1);
		

	}

}
