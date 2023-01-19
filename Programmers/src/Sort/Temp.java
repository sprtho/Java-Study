package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] num = {1, 3 , 10, 7, 6};
		
		//Arrays.sort(num, Collections.reverseOrder());
		
		//Arrays.sort(num, (a,b) -> b > a);
		
		for(int i : num)
			System.out.println(i);
		
		Stack<Integer> stk = new Stack<>();
		
		stk.push(10);
		
		Queue<Integer> que = new LinkedList<>();
		
		que.offer(10);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		
		System.out.println((int)Math.sqrt(16));
		
		HashSet<Integer> hash = new HashSet<>();
		
		hash.add(10);
		hash.add(12);
		hash.add(12);
		hash.add(30);
		
		for(int i : hash)
			System.out.println(i);
		
		

	}

}
