package arrays2D;

public class Main {
	
	public static void main(String[] args) {
		
	Arrays2DSampler test = new Arrays2DSampler();
	}


	/**
	 * PRECONDITION: i>= 0 and i < arr.length
	 * Increases the element at i by 1
	 * decreases the elements at i -1 and i+1, if they exist
	 * AVOIDS array index out of bounds error 
	 * THIS IS SUCH A HEAVILY TESTED CONCEPT 
	 * on every exam, you sould always be in the habit 
	 * @param arr
	 * @param i
	 */
	
	
	private static void changeNeighbors(int[] arr, int i) {
			
			arr[i] = arr[i] + 1;
					
			if(i >= 1) {arr[i+1] = arr[i+1] - 1;}
			
			if(i <= arr.length - 2) {arr[i-1] = arr[i - 1] - 1;}
		
	}
	
	
	
	

}
