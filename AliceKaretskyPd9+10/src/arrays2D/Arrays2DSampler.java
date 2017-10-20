package arrays2D;

public class Arrays2DSampler {

	String[][] pic;
	
	public Arrays2DSampler() {
		pic = new String[10][20];
		print(pic);
		
		
	}

	private void print(String[][] pic2) {
		
		for(int row = 0; row < pic.length; row++) {
			for(int col = 0; col < pic[row].length; col++) {
				
				System.out.print(pic[row][col]);
			}
			
			// line break
			System.out.println("");
			
		}
		//for each style:
		//for each row...
		for(String[] row: pic) {
			//for each column in that row...
			
			for(String col: row) {
				System.out.print(col);
				
			}
			System.out.println("");
			
		}
		
		
	}
	
	
	
}
