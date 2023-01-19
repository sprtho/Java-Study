package Hash;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class BestAlbum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] genres =  {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		HashMap<String, HashMap<Integer, Integer>> map = new HashMap<>();
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(int i = 0; i < genres.length; i++) {
			hm.put(genres[i], hm.getOrDefault(genres[i], 0)+plays[i]);
		}
		
		for(int i = 0; i < genres.length; i++) {
			if(!map.containsKey(genres[i])) {
				HashMap<Integer, Integer> num = new HashMap<>();
				num.put(i, plays[i]);
				map.put(genres[i], num);
			}
			else {
				map.get(genres[i]).put(i, plays[i]);
				
			}
		}
		
		List<String> genre = new ArrayList<>(hm.keySet());
		
		Collections.sort(genre, (o1, o2) -> hm.get(o2) - hm.get(o1));
		
		List<Integer> answer = new ArrayList<>();

		for(String s : genre) {
			
			HashMap<Integer, Integer> music  = map.get(s);
			
			List<Integer> genre_key = new ArrayList<>(music.keySet());
			
			Collections.sort(genre_key, (s1, s2) -> music.get(s2) - music.get(s1));
			
			answer.add(genre_key.get(0));
			
			if(!genre_key.isEmpty())
				answer.add(genre_key.get(1));
			
		}
			
		int[] real_answer = new int[answer.size()];
		
		for(int i = 0; i < real_answer.length; i++)
			real_answer[i] = answer.get(i);
		
		for(int i = 0; i < real_answer.length; i++)
			System.out.println(real_answer[i]);
		
			
	}

}
