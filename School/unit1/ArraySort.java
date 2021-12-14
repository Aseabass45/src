package unit1;

class ArraySort {
	
	static void bubbleSort(int[] sorting1) {

		int n = sorting1.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				if(sorting1[j-1] >sorting1[j]) {
					temp = sorting1[j-1];
					sorting1[j-1] = sorting1[j];
					sorting1[j] = temp;
				}
			}
		}
	}
/*
	public static void main(String[] args) {
		int sorting1[] = new int[25];
		for (int x = 0; x < sorting1.length; x++) {
			sorting1[x] = (int) (Math.random() * 1000) + 1;
		}

		System.out.println("array before sorting");
		for(int i = 0; i < sorting1.length; i++) {
			System.out.print(sorting1[i] + ", ");
		}

		System.out.println();

		bubbleSort(sorting1);

		System.out.println("array after sorting");
		for(int i= 0; i < sorting1.length; i++ ) {
			System.out.print(sorting1[i] + ", ");
		}
	}
	 */
	static void InsertionSort(int sorting2[]) { //make the sorting method which will be used in the driver code/main 

		int n = sorting2.length;

		for(int j = 1; j < n; j++) {
			int key = sorting2[j];
			int i = j-1;
			while((i > -1) && (sorting2 [i] > key)) {
				sorting2[i+1] = sorting2[i];
				i--;
			}
			
			sorting2[i+1] = key;
		}

	}
	public static void main(String[] args) {
		int sorting2[] = new int[25];// make the array and populate it
		for (int x = 0; x < sorting2.length; x++) {
			sorting2[x] = (int) (Math.random() * 1000) + 1;
		}

		System.out.println("array before sorting"); // print the array before sorting it
		for(int i = 0; i < sorting2.length; i++) {
			System.out.print(sorting2[i] + ", ");
		}

		System.out.println();

		InsertionSort(sorting2); // sort the array using insertion

		System.out.println("array after sorting"); // print the sorted array 
		for(int i= 0; i < sorting2.length; i++ ) {
			System.out.print(sorting2[i] + ", ");
		}
	
	}
}
