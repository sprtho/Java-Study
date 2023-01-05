package Java8;

public interface Greet {

	void printName();
	
	default void printNameUpperCase() {
		System.out.println("no");
	}
	
}
