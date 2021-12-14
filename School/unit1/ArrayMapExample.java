package unit1;


class ArrayMapExample {
	static private final int n =17;
	private static int[][] map = new int[n][n];
	
	public static void main (String[] args){
		FillBoard();
		printBoard();
	}
	
	static void printBoard() {
		for(int row=0; row<n; row++) {
			for(int col=0; col<n; col++){
				System.out.printf("%3d", map[row][col]);
			}
			System.out.println();
		}
		//System.out.println("=========="); //print out dividing line of the correct length
		for (int i = 0; i < n*3 +2; i++) System.out.print("=");System.out.println();	
	
	}
	
	static void FillBoard() {
		for (int i = 0; i < n; i++) {
			map[i][0] = 10;
			map[0][i] = 10;
		}
		for (int i = n-1; i > 0; i--) {
			map[i][n-1] = 10;
			map[n-1][i] = 10;
		}
		map[8][2] = 99;
	}
	
}