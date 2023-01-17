package javaStudy;

public class BizExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BizService biz = new BizService();
		try {
			biz.bizMethod(5);
		} catch (BizException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			biz.bizMethod(-3);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
