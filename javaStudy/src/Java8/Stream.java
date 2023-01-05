package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("keesun");
		names.add("white");
		names.add("toby");
		names.add("foo");
		
		List<String> collect = names.stream().map((s) -> {
			System.out.println(s);
			return s.toUpperCase();
		}).collect(Collectors.toList()); // 종료 오퍼레이션을 넣어줘야 출력이된다.
		
		collect.forEach(System.out::println);
		
		names.forEach(System.out::println); // 스트림은 처리하는 데이터 소스를 변경하지 않는다.

	}

}
