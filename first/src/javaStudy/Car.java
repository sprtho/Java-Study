package javaStudy;

public class Car {
	// 타입 필드명
	String name;
	int number;
	
	public Car(String name) {
//		this.name = name; // class 안의 자신의 변수를 선언할 떄 this
		this(name, 0);
		System.out.println("이름은 : " + name);
	}
	
	public Car() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음",0); // 아래  오버로딩된 Car 생성자 호출
//		System.out.println("기본 생성자 실행");
	}
	
	public Car(String name, int num) {
		this.name = name;
		this.number = num;
		
	}
	
	public void run() {
		System.out.println("말달리다");
	}
	
	public void running() {
		System.out.println("런닝맨");
	}

}
