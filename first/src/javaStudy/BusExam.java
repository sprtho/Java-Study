package javaStudy;

public class BusExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bus bus = new Bus();
		
//		bus.run();
		
		Car c = new Bus();
		
		c.run();
		
		
		Bus bus = (Bus)c;
		
		bus.run();
		
		bus.bangrun();


	}

}
