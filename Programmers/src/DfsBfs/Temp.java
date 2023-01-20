package DfsBfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<int[]> que = new LinkedList<int[]>();
		
		que.add(new int[]{4,5});
		
		int[] number = que.poll();
		
		for(int i : number)
			System.out.println(i);
		
		Stack<int[]> stk = new Stack<>();
		
		stk.add(new int[] {4,5});
		
		stk.add(new int[] {8,9});
		
		System.out.println(stk);
		
		for(int[] i : stk)
			System.out.println(i[0]);
		
		List<int[][]> list = new ArrayList<>();
		
		list.add(new int[][] {{4,5,6},{3,2,1}});

	}

}
