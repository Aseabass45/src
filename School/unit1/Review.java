package unit1;

import java.util.Arrays;

class Review {

	public static void main(String[] args) {

		int biggest = 0;
		int smallest = 100;
	int numb[] = new int [8];
	for (int x = 0; x < 8; x++) {
		numb[x] = (int) (Math.random() * 100) + 1;
		System.out.println(numb[x]);
		
		if (numb[x] > biggest) {
			biggest = numb[x];
		}
		if (numb[x] < smallest) {
			smallest = numb[x];
			
		}
	}
	Arrays.sort(numb);
	System.out.println("the biggest number is " + biggest);
	System.out.println("the smallest number is " + smallest);
	
	}
}
