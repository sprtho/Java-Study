package javaStudy;

public class IntegerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer i1 = 5;
        int max_int = i1.MAX_VALUE;
        long i1_long = i1.longValue();
        
        System.out.println("max_int : " + max_int);
        System.out.println("max_int : " + i1_long);
        
        int i2 = 5;
       // int min_int = i2.MIN_VALUE;
        //long i2_long = i2.longValue();
        
        String name = "½ÂÁø";
        
        StringBuffer st_name = new StringBuffer();
        
        st_name.append("½ÂÁøÀÌ");
        		
        System.out.println(name);
        System.out.println(st_name);
        
        System.out.println(Math.random());

	}

}
