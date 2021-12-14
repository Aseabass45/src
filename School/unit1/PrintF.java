package unit1;

class PrintF {
	public static void main(String[] args) {
		double x = 0.14285;
		System.out.printf("| %9f  |%n", x);
		
		String name = "bessy";
		String colour = "brown";
		int weight = 1200;
		
		System.out.printf("The cow's name is %5s, she is %5s and weighs %4d kg %n", name, colour, weight);
		
		
		int xx = 123;
		double xy = 123;
		System.out.println("| 12345678 |");
		System.out.println("| ======== |");
		System.out.printf("| %8d |%n", xx);
		System.out.printf("| %08d |%n", xx);
		System.out.printf("| %-8d |%n", xx);
		System.out.printf("| %+8d |%n", xx);
		System.out.printf("| %8.1f |%n", xy);
		
		
		
		
	}

}
