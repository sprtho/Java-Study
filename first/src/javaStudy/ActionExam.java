package javaStudy;

public class ActionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Action action = new MyAction();
//		
//		action.Action();
		
		Action action = new Action() {
			
			@Override
			public void Action() {
				// TODO Auto-generated method stub
				System.out.println("action");
				
			}
		};
		
		action.Action();

	}

}
