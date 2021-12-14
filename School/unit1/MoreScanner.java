package unit1;

import java.util.Scanner;

class MoreScanner {

	public static void main(String argggg[]) {
		Scanner keyg = new Scanner (System.in);
		int x= -1;
		int y=-1;
		while(true) { 

			System.out.print("Enter an integer: " );

			//lets see if there is an integer ready for input
			if(keyg.hasNextInt()) {
				x = keyg.nextInt();
				break;
			}else {
				keyg.next(); //clear whatever was typed from the keyb buffer
				System.out.println("that was not a integer");

			}
			System.out.println(x*10);

		}
	}
}
