package unit1;

class Modulus3 {

	public static void main(String[] args) {

		for(int i=1; i<200; i++) {
			System.out.print(i+ " ");
			if(i%12 == 0 ) System.out.println();
			
			
		}
		System.out.println();
		System.out.println();
		for(int i=1; i<200; i++) {
			System.out.printf("%3d ", i);
			if(i%12 == 0 ) System.out.printf("%n");
			
			
		}

	}

}
