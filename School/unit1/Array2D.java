package unit1;

public class Array2D {
	public static void main(String[] args) {
		int [ ] [ ] array = new int [3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				
				array[i][j] = 0;
			}
	 }	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
		System.out.print(array[i][j]);
			}
		}
  }
}