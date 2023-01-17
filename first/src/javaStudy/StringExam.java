package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "hello"; // 이렇게 선언하면 상수영역
		String str2 = "hello2";
		
		String str3 = new String("hello"); // 상수영역 x 새로운 힙영역
		String str4 = new String("hello");
		
		if (str3.equals(str4))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
		
		System.out.println(str1.substring(3));

		//System.out.println(str1);
	}

}
