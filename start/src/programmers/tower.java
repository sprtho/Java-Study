/*���� ������ ž N�븦 �������ϴ�. ��� ž�� ����⿡�� ��ȣ�� ��/�����ϴ� ��ġ�� ��ġ�߽��ϴ�. 
  �߻��� ��ȣ�� ��ȣ�� ���� ž���� ���� ž������ �����մϴ�. ����, �� �� ���ŵ� ��ȣ�� �ٸ� ž���� �۽ŵ��� �ʽ��ϴ�.
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
		
		System.out.println("�迭�� ���̸� �Է��ϼ���:");
		
		tw_length = scan.nextInt();
		
		int answer[] = new int[tw_length];
		
		answer[0] = 0;
	
		for(int i=0 ; i<tw_length ; i++) {
			tower[i] = scan.nextInt();
		}
		
		for(int i=0 ; i<tw_length ; i++) {
			System.out.println("�迭" + i + "��° ����:" + tower[i]);
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
			System.out.println("����迭" + i + "��° ����:" + answer[i]);
		}
	

	}

}
