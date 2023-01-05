package Java8;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Plus10 plus10 = new Plus10();
//		System.out.println(plus10.apply(1));
		
		Integer num = 10;
		int num2 = 5;
		
		Function<Integer, Integer> plus10 = (number) ->  number + 10;
		Function<Integer, Integer> multiply2 = (i) -> i * 2;
		Function<Integer, Integer> plusanmulti = plus10.compose(multiply2); // 함수의 결합
		
		
		System.out.println(plus10.apply(1));
		System.out.println(multiply2.apply(2));
		System.out.println(plusanmulti.apply(4));
		System.out.println(plus10.andThen(multiply2).apply(2));
		
//		Supplier<Integer> get10 = new Supplier<Integer>() {
//			
//			@Override
//			public Integer get() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
		Supplier<Integer> get10 = () -> 10;
		System.out.println(get10.get());
		
		Predicate<String> startsWithabc = (s) -> s.startsWith("abc");
		System.out.println(startsWithabc.test("ab"));

		

	}

}
