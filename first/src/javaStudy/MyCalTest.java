package javaStudy;

public class MyCalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new MyCal();
		
		cal.plus(3, 4);
		
		System.out.println(cal.exec(5, 6));
		
		Calculator.exec2(3, 4); // Static 함수는 클래스명을 직접 선언해야함
		
		
		

	}

}
