package programmers;

public class parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "(()()()()())()()())";
		
		boolean answer = true;
		
		int sum = 0;
		
		System.out.println(s.length());
		
		for(int i=0; i<s.length(); i++) {
		
			
			if(s.charAt(i) == '(') {
				sum += 1;
			}
			else {
				if(sum == 0) {
					answer = false;
					break;
				}
				sum -= 1;
			}
		}
		
		if (sum!=0) {
			answer = false;
		}
		
		if(answer)
			System.out.println("올바른괄호");
		else
			System.out.println("올바르지 않은 괄호");
			
		
	}

}
