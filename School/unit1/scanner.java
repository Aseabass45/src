package unit1;

import java.util.Scanner;

public class scanner {
	   public static void main(String[] args) {
		   
		      Scanner sc =new Scanner(System.in);
			  
			  
		      System.out.print("Enter your name: ");
		      String name = sc.nextLine();
		      
		      System.out.print("\nEnter your age: ");
		      int age = sc.nextInt();
			  
		      System.out.println(name + " is "+ age + " years old.");

		   } 
		}


