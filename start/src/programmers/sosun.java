// n���� ���ڸ� ���� �迭���� ������ ���ڸ� ������ �� ���� ���� �Ҽ��� ����� ������ ���ϴ� ����

package programmers;

public class sosun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = new int[50];
		
		num = new int[]{1 , 2 , 7 , 6 , 4};
		
		System.out.println(num.length);
		
		int sum = 0;
		
		int answer = 0;
		
		for(int i=0 ; i<num.length ; i++ ) {
			
			for(int j=i+1 ; j<num.length ; j++) {
				
				for(int k=j+1 ; k<num.length ; k++) {
					
					sum = num[i] + num[j] + num[k];
					
					int count = 0;
					
					for(int n=1 ; n<=sum ; n++) {
						
						if(sum%n==0)
							count++; 
							
					}
					
					
					if(count==2)
						answer++; 
					
				}
			}
			
		}
		
		System.out.println("�Ѱ���:" + answer);
		
		

	}

}
