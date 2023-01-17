package javaStudy;

public class BizException extends Exception {
	
	public BizException(String msg) {
		super(msg);
		
	}
	
	public BizException(Exception ex) {
		super(ex);
	}

}
