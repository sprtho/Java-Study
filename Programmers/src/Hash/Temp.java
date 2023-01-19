package Hash;
import java.util.*;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] genres =  {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
        ArrayList<Integer> answer = new ArrayList<>();
        
        HashMap<String, Integer> num = new HashMap<>(); // 장르별 총 개수
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>(); // 장르에 속하는 노래 및 재생횟수
        for(int i = 0; i < plays.length; i++) {
            if(!num.containsKey(genres[i])) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                num.put(genres[i], plays[i]);
            } else {
                music.get(genres[i]).put(i, plays[i]);
                num.put(genres[i], num.get(genres[i]) + plays[i]);
            }
        }
        
        System.out.println(num);
        System.out.println(music);
        
        String name = "Seung Jin";
        		
        String[] names = name.split(" ");
        
        System.out.println(names[0].equals("Seung"));
        
        
        for(int i : plays)
        	System.out.println(i);
       

	}

}
