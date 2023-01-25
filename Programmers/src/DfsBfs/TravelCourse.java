package DfsBfs;

import java.util.ArrayList;
import java.util.Collections;

public class TravelCourse {
	
	static boolean[] visited;
	static ArrayList<String> allRoute;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TravelCourse travelCourse = new TravelCourse();
		
		//String[][] tickets = { {"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		
		String[] answer = {};
		int cnt = 0;
		visited = new boolean[tickets.length];
		
		allRoute = new ArrayList<>();
		
		travelCourse.dfs("ICN", "ICN", tickets, cnt);
		
		System.out.println(allRoute);
		
		Collections.sort(allRoute);
		
		System.out.println(allRoute);
		
		answer = allRoute.get(0).split(",");
		
	}
	
	public void dfs(String start, String route, String[][] tickets, int cnt) {
		if(cnt == tickets.length) {
			allRoute.add(route);
			return;
		}
		
		for(int i = 0; i < tickets.length; i++) {
			if(start.equals(tickets[i][0]) && !visited[i]) {
				visited[i] = true;
				dfs(tickets[i][1], route+","+tickets[i][1], tickets, cnt+1);
				visited[i] = false;
			}
		}
	}

}
