package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class GreetingMain {

	public static void main(String[] args) {
		
//		UnaryOperator<String> hi = (s) -> "hi " + s;
		UnaryOperator<String> hi = Greeting::hi;
		
		Supplier<Greeting> newGreeting = Greeting::new; // 입력 파라미터가 없어서 일반 생성자 참조
		
		newGreeting.get();
		
		Function<String, Greeting> keesunGreeting = Greeting::new; // 입력 파라미터가 있어서 파라미터 생성자 참조
		
		Greeting greeting = keesunGreeting.apply("keesun");
		
		System.out.println(greeting.getName());
		
		String[] names = {"keesun", "white", "red"};
		
		Arrays.sort(names, String::compareToIgnoreCase);
		
//		for(int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		System.out.println(Arrays.toString(names));
		
		
		
		
		

	}

}
