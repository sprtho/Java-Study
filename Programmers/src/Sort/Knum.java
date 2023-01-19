package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Knum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,5,2,6,3,7,4};
		
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] answer = new int[commands.length];
		
		for (int i = 0; i < commands.length; i++) {
			int num = commands[i][0] - 1;
			int num2 = commands[i][1];
			int choice = commands[i][2] - 1;
			
			int[] temp = Arrays.copyOfRange(array, num, num2);
			
			Arrays.sort(temp);
			
			answer[i] = temp[choice];
			
		}
		
		for(int i : answer)
			System.out.println(i);
		
/*		List<Integer> answer = new ArrayList<>();
		
		for (int[] command : commands) {
			int num = command[0] - 1;
			int num2 = command[1];
			int choice = command[2] - 1;
			
			List<Integer> list = new ArrayList<>();
			
			for(int i = num ; i < num2; i++) {
				list.add(array[i]);
			}
			
			Collections.sort(list);
			
			answer.add(list.get(choice));
			
			list.clear();
			
		}
		
		int[] real_answer = new int[answer.size()];
		
		for(int i = 0; i < real_answer.length; i++)
			real_answer[i] = answer.get(i);*/
			

	}

}
