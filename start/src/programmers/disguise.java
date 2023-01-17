//[[“yellow_hat”, “headgear”], [“blue_sunglasses”, “eyewear”], [“green_turban”, “headgear”]]
package programmers;

import java.util.*;



public class disguise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clothes[][] = {{"yellow_hat", "headgear"}, 
							  {"blue_sunglasses", "eyewear"}, 
							  {"green_turban", "headgear"},
							  {"bad_girl" , "headgear"},
							  {"good_girl" , "eyewear"}};
		
		int answer = 1;
		
	//	HashMap<String , String> hm = new HashMap<>(); // key , value
		
		HashMap<String , Integer> hm = new HashMap<>();
		
		for(int i=0; i<clothes.length ;  i++) {
			
//			hm.put(clothes[i][1] , 1);
			if(hm.get(clothes[i][1]) == null) {
				hm.put(clothes[i][1] , 1);
			}
			else {
				hm.put(clothes[i][1] , hm.get(clothes[i][1])+1);
			}
			
		}
		
		System.out.println(hm.keySet());
				
			
			for(String cloth : hm.keySet()) {
				answer *= hm.get(cloth) + 1;
			}
			
			answer -= 1;
				
			
		
		
/*		System.out.println(hm.keySet()); //  keyset() -> key 값 다 가져옴
		System.out.println(hm.get("headgear")); // get(key값) -> key
		System.out.println(hm);*/
			
		System.out.println(hm);
		
		System.out.println("답은: " + answer);
		
		//System.out.println(clothes[0][1]);

	}

}
