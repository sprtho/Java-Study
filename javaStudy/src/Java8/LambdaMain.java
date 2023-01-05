package Java8;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LambdaMain lambdaMain = new LambdaMain();
		lambdaMain.run();

	}
	
	private void run() {
		int baseNumber = 10;
		
		// 로컬 클래스
		class LocalClass {
			void printBaseNumber() {
				System.out.println(baseNumber);
			}
			
		}
		
		// 익명 클래스
		Consumer<Integer> integerConsumer = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer baseNumber) {
				System.out.println(baseNumber);
				
			}
		}; 
		
		
		// 람다
		IntConsumer printInt = (i) -> System.out.println(i + baseNumber);
		// 람다는 effective final 변수가 아니면 사용할 수 없다.
		
		integerConsumer.accept(15);
		printInt.accept(10);
		
		
	}
	
	

}
