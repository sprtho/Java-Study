package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringApiMain {

	public static void main(String[] args) {
		List<StreamApi> springClasses = new ArrayList<>();
		springClasses.add(new StreamApi(1, "spring boot", true));
		springClasses.add(new StreamApi(2, "spring data jpa", true));
		springClasses.add(new StreamApi(3, "spring mvc", false));
		springClasses.add(new StreamApi(4, "spring core", false));
		springClasses.add(new StreamApi(5, "rest api development", false));
		
		List<StreamApi> javaClasses = new ArrayList<>();
		javaClasses.add(new StreamApi(6, "The Java, Test", true));
		javaClasses.add(new StreamApi(7, "The Java, Code manipulation", true));
		javaClasses.add(new StreamApi(8, "The Java, 8 to 11", false));
		
		List<List<StreamApi>> keesunEvents = new ArrayList<>();
		keesunEvents.add(springClasses);
		keesunEvents.add(javaClasses);
		
		System.out.println("spring 으로 시작하는 수업");
		springClasses.stream()
				.filter(oc -> oc.getTitle().startsWith("spring"))
				.forEach(oc -> System.out.println(oc.getId()));
		
		
		System.out.println("close 되지 않은 수업");
		springClasses.stream()
				.filter(oc -> !oc.isClosed())
				.forEach(oc -> System.out.println(oc.getId()));
		
		System.out.println("수업 이름만 모아서 스트림 만들기");
		springClasses.stream()
				.map(oc -> oc.getTitle())
				.forEach(s -> System.out.println(s));
		
		System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
		keesunEvents.stream()
				.flatMap(list -> list.stream())
				.forEach(oc -> System.out.println(oc.getId()));
		
		System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");
		Stream.iterate(10, i -> i+1)
			.skip(10)
			.limit(10)
			.forEach(System.out::println);
		
		System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");
		boolean test = javaClasses.stream().anyMatch(oc -> oc.getTitle().contains("Test"));
		System.out.println(test);
		
		System.out.println("스프링 수업 중에 제목에 spring 들어간 것만 모아서 List로 만들기");
		List<String> spring = springClasses.stream()
				.filter(oc -> oc.getTitle().contains("spring"))
				.map(oc -> oc.getTitle())
				.collect(Collectors.toList());
		
//		spring.forEach(s -> System.out.println(s));
		
		springClasses.forEach(s -> System.out.println(s.getTitle().contains("spring")));
		
		String name = "spring all";
		
		System.out.println(name.contains("alt"));
		
		
		
		
		
		

	}

}
