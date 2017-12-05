package search;

public class Fibonacci {
	
	public int[] sequenceNums;
	
	public Fibonacci() {
		 int[] sequenceNums = {1,1,2,3, 4};
		
	}

	public int createSequence(int x, int y ) {
		
		if(x == 0) {
			
			return sequenceNums[0];
		}
		
		else {
		int	newNum = createSequence(x, 0) + createSequence(0,y);
		return	newNum;
			
		}
		
		
	}
}
