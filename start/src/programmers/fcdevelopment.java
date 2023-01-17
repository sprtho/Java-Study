// Programmers 기능개발

package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class fcdevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] progress;
		int[] speeds;
		
		progress = new int[] {93 , 50 , 30 , 55 , 40 , 5};
		speeds = new int[] {1,10, 30,5 , 20 , 10};
		
		
		Queue<Integer> result = new LinkedList<>();
		int index = 0, count = 0;
		int daycount = 1;
		
		while(index < progress.length) {
			System.out.println(daycount + "번째 날 작업 시작!!");
			
			for (int i=0; i<progress.length; i++) { // 하루진도율처리
				progress[i] += speeds[i];
			} 
			
			//기본적으로 앞작업이 끝나야 뒷작업도 마무리 짓을 수 있음
			if (progress[index] >= 100) {
				while(index < progress.length && progress[index] >= 100) {
					count++;
					index++;
				}
				
				result.add(count);
				
				System.out.println(daycount + "번째 날 " + count + "개의 작업 마무리");
				
				count = 0;
				
			}
			
			
			
			daycount++;
			
		}
		
		int[] answer = new int[result.size()];
		
		for (int i=0; i <answer.length; i++)
			answer[i] = result.poll();
		
		for (int i=0; i <answer.length; i++)
			System.out.println(answer[i]);

	}

}
