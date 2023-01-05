package Java8;

public class Foo {

	public static void main(String[] args) {
//		RunSomething runSomething = new RunSomething() {
//			
//			@Override
//			public void doIt() {
//				System.out.println("Hello");
//				System.out.println("Lambda");
//				
//			}
//		};
//		RunSomething runSomething = () -> System.out.println("Hello2");
//		runSomething.doIt();
		
		RunSomething runSomething = (number) -> {
			return number + 10;
		};
		
		System.out.println(runSomething.doIt(1));
		System.out.println(runSomething.doIt(1));
		System.out.println(runSomething.doIt(1));

	}

}
