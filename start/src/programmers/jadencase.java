//JadenCase�� ��� �ܾ��� ù ���ڰ� �빮���̰�, �� ���� ���ĺ��� �ҹ����� ���ڿ��Դϴ�. 
//���ڿ� s�� �־����� ��, s�� JadenCase�� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

package programmers;

public class jadencase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s = "3people unFollowed me";
		String s = "for the last week";
		
		
		String split[] = s.split(" ");
		
		String upper[] = new String[split.length];
		
		System.out.println(split[0]);
		
		for(int i=0 ; i <split.length; i++) {
			
			upper[i] = split[i].toUpperCase();
			
		}
		
		String a = String.valueOf(split[0].charAt(0)).toUpperCase();
		
		System.out.println(a);
		
		split[0].charAt(0);
				
		System.out.println(upper[0]);
		
		//System.out.println("abc".toUpperCase());
		
		


	}

}


