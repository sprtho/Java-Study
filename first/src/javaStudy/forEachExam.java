package javaStudy;

public class forEachExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] iarr = {10,20,30,40,50};
		
		for(int i=0; i<iarr.length; i++)
		{
			int value = iarr[i];
//			System.out.println(value);
		}
		
		// for each 문
		// for(타입 값을 받아줄 변수명 : 출력하고 싶은 자료구조 )
		for(int value:iarr)
		{
			System.out.println(value);
		}

	}

}
