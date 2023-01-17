package javaStudy;

public class LedTV implements TV { // TV 인터페이스를 구현

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끄다");

	}

	@Override
	public void changVolume(int volume) {
		// TODO Auto-generated method stub
		
		System.out.println("볼륨을 조정하다");

	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널을 조정하다");

	}

}
