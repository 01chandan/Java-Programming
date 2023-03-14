//How to read data from keyboard (user)
//when we write import java.util.Scanner we create instance of Scanner class
import java.lang.*;
import java.util.*;

class userdata
{
	public static void main(String args[])
	{
		//System.in it reference to keyboard and reading user data from the keyboard
		Scanner scan = new Scanner(System.in); //Ststem.in is compulsory to attach keyboard & it is built in object
		System.out.println("Enter First Num: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter Second Num: ");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("Result: " + sum);
	}
}