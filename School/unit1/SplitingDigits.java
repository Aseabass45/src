package unit1;

class SplitingDigits {
/*
	public static void main (String args[]) {

		int ones, tens;
		
		ones = (int) (Math.random()*9);
		tens = (int) (Math.random()*9);
		
		System.out.print(tens);
		System.out.print(ones);
		System.out.println();
		System.out.println("the tens value is " + tens);
		System.out.println("the ones value is " + ones);
		
	*/	
	/*
	public static void main (String args[]) {
		
		int number = (int) (Math.random()*99);
		int ones = number%10;
		int tens =(number-ones)/10;
		
		System.out.print(number);
		System.out.println();
		System.out.println("the tens value is " + tens);
		System.out.println("the ones value is " + ones);
		
	}
	*/
	
	public static void main (String args[]) {
	
		int number = (int) (Math.random()*99+10);
		String numberString = Integer.toString(number);
		int ones, tens;
		
		tens= Integer.parseInt(numberString.substring(0,1));
		ones= Integer.parseInt(numberString.substring(1, numberString.length()));
		
		System.out.print(number);
		System.out.println();
		System.out.println("the tens value is " + tens);
		System.out.println("the ones value is " + ones);
		
		
	}
}


