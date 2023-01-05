package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalMain {

	public static void main(String[] args) {
		List<OptionalClass> springClasses = new ArrayList<>();
		springClasses.add(new OptionalClass(1, "spring boot", true));
		springClasses.add(new OptionalClass(2, "spring data jpa", true));
		springClasses.add(new OptionalClass(3, "spring mvc", false));
		springClasses.add(new OptionalClass(4, "spring core", false));
		springClasses.add(new OptionalClass(5, "rest api development", false));
		
		OptionalClass spring_boot = new OptionalClass(1, "spring boot", false);
//		OptionalProgress progress = spring_boot.getProgress();
		//System.out.println(progress); // null 발생
		
		Optional<OptionalProgress> progress = spring_boot.getProgress();
		
		//System.out.println(progress);
		
		Optional<OptionalClass> spring = springClasses.stream()
				.filter(oc -> oc.getTitle().startsWith("jpa"))
				.findFirst();
		
		boolean present = spring.isPresent();
		
		System.out.println(present);

	}

}
