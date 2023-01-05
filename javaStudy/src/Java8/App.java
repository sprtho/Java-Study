package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class App {

	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		name.add("keesun");
		name.add("white");
		name.add("toby");
		name.add("foo");
		name.add("name");
		//name.add("name");
		
//		name.forEach(System.out::println);
		
		Spliterator<String> spliterator = name.spliterator();
		
//		while (spliterator.tryAdvance(System.out::println));
		
		long k = name.stream().map(String::toUpperCase)
					.filter(s -> s.startsWith("K"))
					.count();
		
//		System.out.println(k);
		
		name.removeIf((s) -> s.startsWith("k"));
				
		name.forEach(System.out::println);

	}

}
