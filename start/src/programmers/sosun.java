// n개의 숫자를 가진 배열에서 세개의 숫자를 더했을 때 더한 값이 소수인 경우의 개수를 구하는 문제

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
		
		System.out.println("총개수:" + answer);
		
		

	}

}
