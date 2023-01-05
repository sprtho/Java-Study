package javaStudy;

import java.lang.reflect.Method;

public class AnnotationExam {

	public static void main(String[] args) {

		Annotation ano = new Annotation();

		try {
			Method method = ano.getClass().getDeclaredMethod("hello");
			
			if(method.isAnnotationPresent(Count100.class)) {
				
				for(int i = 0; i < 100; i++) {
					ano.hello();
					
				}
			}else {
				ano.hello();
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		ano.hello();

	}

}
