
package programmers;

public class pivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pivo[] = new int[1000];
		
		pivo[0] = 0;
		pivo[1] = 1;
		
		for(int i=2; i<10; i++) {
			pivo[i] = pivo[i-2] + pivo[i-1];
			
			System.out.println("pivo[" + pivo[i] + "]");
			
		}

	}

}
