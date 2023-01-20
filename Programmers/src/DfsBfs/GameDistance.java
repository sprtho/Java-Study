package DfsBfs;

import java.util.LinkedList;
import java.util.Queue;

public class GameDistance {
	
	int[] dx = {1, 0 , -1, 0};
	int[] dy = {0, 1 , 0, -1};	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer = 0;
		
		GameDistance gameDistance = new GameDistance();
		
		//int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
		
		System.out.println(maps[0].length);
		

		
		int[][] visible = new int[maps.length][maps[0].length];
		
		gameDistance.bfs(maps, visible);
		
		if (visible[maps.length - 1][maps[0].length - 1] == 0) {
			answer = -1;
		} else {
			answer = visible[maps.length - 1][maps[0].length - 1];
		}
		
		System.out.println(answer);
		
	}
	
	public void bfs(int[][] maps, int[][] visible) {
		
		visible[0][0] = 1;
		
		Queue<int[]> queue = new LinkedList<int[]>();
		
		queue.add(new int[] {0,0});
		
		while(!queue.isEmpty()) {
			
			int[] route;
			
			route = queue.poll();
			
			for(int i = 0; i < 4; i++) {

				int bf_x, bf_y;
				int go_x, go_y;
				
				bf_x = route[0]; // 이전 x 좌표
				bf_y = route[1]; // 이전 y 좌표
				
				go_x = bf_x + dx[i];
				go_y = bf_y + dy[i];
				
				if(go_x < 0 || go_y < 0 || go_x > maps.length - 1 || go_y > maps[0].length - 1)
					continue;
				
				System.out.println("x좌표" + go_x + "y좌표" + go_y);
				if(visible[go_x][go_y] == 0 && maps[go_x][go_y] == 1) {
					queue.add(new int[] {go_x, go_y});
					visible[go_x][go_y] = visible[bf_x][bf_y] + 1;
				}
			}
		}	
	}

}
