package unit1;

class Modulus {

	public static void main(String[] args) {
		int left = 0;
		
		for(int i=0; i<101; i++) {
			int right =i%8;
			
			System.out.printf("%3d %4d %n", left, right);
			left +=1;
		}


	}

}
