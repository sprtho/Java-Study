package Java8;

@FunctionalInterface
public interface RunSomething {
	
	int doIt(int number);
	
	
	static void pringName() {
		System.out.println("keesun");
	}
	
	default void printAge() {
		System.out.println("40");
	}

}
