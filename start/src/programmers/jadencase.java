//JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 
//문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

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


