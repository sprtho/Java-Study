package DfsBfs;


public class TargetNumber {

	static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int answer = 0;
        
        TargetNumber targetNumber = new TargetNumber();
        
        int[] numbers = {4,1,2,1};
        
        int target = 4;
		
		targetNumber.dfs(numbers, target, 0, 0);
		
		answer = count;
		
		System.out.println(count);
        
    }
    
	public void dfs(int[] numbers, int target, int sum, int idx) {
		
		if (idx == numbers.length) {
			if(sum == target)
				count++;
		}
		else {
			dfs(numbers, target, sum + numbers[idx], idx + 1);
			dfs(numbers, target, sum - numbers[idx], idx + 1);
		}
		
	}		

}
