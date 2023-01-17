package programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class truck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Stack<Integer> stk = new Stack<>();
		Queue<Integer> que = new LinkedList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		int bridge_length = 0;
		int weight = 0;
		int[] truck_weights;
		truck_weights = new int[]{7 , 4 , 5 , 6};
		
		System.out.println("다리 길이를 입력하세요:");
		
		bridge_length = scanner.nextInt();
		
		System.out.println("다리가 견딜 수 있는 무게를 입력하세요");
		
		weight = scanner.nextInt();
		
//		System.out.println(truck_weights.length);
		
		for(int i : truck_weights)
			que.add(i);
		
		int tmp;
		
		while(!que.isEmpty()) {
			
			tmp = que.poll();
		//	System.out.println(tmp);
			
		}
		

	}

}


/*
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        return answer;
    }
}*/