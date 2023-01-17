/*수평 직선에 탑 N대를 세웠습니다. 모든 탑의 꼭대기에는 신호를 송/수신하는 장치를 설치했습니다. 
  발사한 신호는 신호를 보낸 탑보다 높은 탑에서만 수신합니다. 또한, 한 번 수신된 신호는 다른 탑으로 송신되지 않습니다.
  [6,9,5,7,4]  -> return [0,0,2,2,4]
 */

package programmers;

import java.util.Scanner;

public class tower {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int tower[] = new int[100];
		int tw_length = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 길이를 입력하세요:");
		
		tw_length = scan.nextInt();
		
		int answer[] = new int[tw_length];
		
		answer[0] = 0;
	
		for(int i=0 ; i<tw_length ; i++) {
			tower[i] = scan.nextInt();
		}
		
		for(int i=0 ; i<tw_length ; i++) {
			System.out.println("배열" + i + "번째 숫자:" + tower[i]);
		}
		// 6 9 5 7 4
		for(int i=1 ; i<tw_length ; i++) {
			for(int j=i-1 ; j>=0 ; j--) {
				
				if(tower[j] > tower[i]) {
					answer[i] = j+1;
					break;
				} else {
					continue;
				}
				
			}
		}
		
		for(int i=0 ; i<tw_length ; i++) {
			System.out.println("정답배열" + i + "번째 숫자:" + answer[i]);
		}
	

	}

}
