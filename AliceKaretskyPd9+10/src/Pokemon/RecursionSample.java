package Pokemon;

public class RecursionSample {
	
	
	static int value = 18;
	
	public RecursionSample() {
		
		
	}

	public static int countPrimeFactors(int value, int testPrime) {
		
		if(testPrime == value)
			return 1;
		
		else if(value % testPrime ==0)
			return countPrimeFactors(value/testPrime,testPrime) +1;
		else return
				countPrimeFactors(value, testPrime + 1);
		
		
	}
	
	public static int factorial(int x) {
		
		if(x <= 1) 
			return value;
			
		else
			return value * factorial(value-1);
		
	}
	
}
