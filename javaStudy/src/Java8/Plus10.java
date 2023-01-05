package Java8;

import java.util.function.Function;

public class Plus10 implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer integer) {
		// TODO Auto-generated method stub
		return integer + 10;
	}
	
	

}
